package com.jmk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.jmk.beans.Customer;
import com.jmk.beans.User;
import com.jmk.dao.CustomerAccountDAO;
import com.jmk.dao.CustomerDAO;
import com.jmk.dao.UserDAO;
import com.jmk.util.StatusMessage;
import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private CustomerDAO customerDAO;
    @Autowired
    private CustomerAccountDAO customerAccountDAO;

    final static Logger logger = Logger.getLogger(CustomerServiceImpl.class);

    @Transactional(rollbackFor = {DataIntegrityViolationException.class, DataAccessException.class})
    @Override
    public String createCustomer(Customer customer) {

        logger.info("Enterd Into create customer");
        String message = StatusMessage.STATUS_FAILED;
        if (customer != null && customer.getUser() != null) {
            User user = customer.getUser();
            try {
                if (customer.getName() != null && user.getMobile1() != null && user.getPassword() != null) {
                    // Save user information in user table
                    Integer userId = userDAO.createUser(user);
                    logger.info("User created id" + userId);

                    if (userId != null && userId > 0) {
                        // set newly created user id
                        customer.getUser().setUserId(userId);
                        // save customer information in customer table
                        Integer customerId = customerDAO.createCustomer(customer);
                        System.out.println("Customer ID:" + customerId);
                        if (customerId != null && customerId > 0) {
                            logger.info("Customer created id" + customerId);
                            if (customer.getCustomerAccount() != null) {
                                logger.info("Account going to be save");
                                customer.getCustomerAccount().setCustomerId(customerId);
                                System.out.println(customer.getCustomerAccount());
                                if (customer.getCustomerAccount().getCreditAmount() > 0) {

                                    customer.getCustomerAccount()
                                            .setCurrentBalance(customer.getCustomerAccount().getCreditAmount());
                                } else {
                                    customer.getCustomerAccount()
                                            .setCurrentBalance(customer.getCustomerAccount().getDebitAmount() * -1);

                                }
                                Integer transactionId = customerAccountDAO.saveSale(customer.getCustomerAccount());
                                if (transactionId != null && transactionId > 0) {
                                    logger.info("Customer account created");
                                    message = StatusMessage.STATUS_SUCCESS;
                                }

                            } else {
                                // if customerAccount if null means account
                                // created,there is no information to save in
                                // account details
                                message = StatusMessage.STATUS_SUCCESS;
                            }
                        } else {
                            System.out.println("Customer creation failed");
                        }
                    } else {
                        System.out.println("User Creation failed");
                    }
                } else {
                    message = "Mobile1,Password and Customer Name is required";
                }
            } catch (DataAccessException e) {
                System.out.println(e);
                // store messaged based on exception message
                message = "Customer creation failed please try again";
            } catch (Exception e) {
                System.out.println(e);
                message = "Customer creation failed please try again";
            }
        } else {
            message = "Customer information required,please try again";
        }
        return message;
    }

    public List<Customer> getAllCustomer() {
        List<Customer> list = null;
        try {
            return customerDAO.getAllCustomer();
        } catch (EmptyResultDataAccessException ex) {
            logger.info("Exception in getAllCustomer", ex);
        } catch (Exception ex) {
            logger.info("Exception in getAllCustomer", ex);
        }
        return list;
    }

    public Customer getCustomer(Integer customerId) {
        return null;
    }

    public Customer getCustomer(String mobile) {
        return null;
    }

    @Override
    public String updateCustomer(Customer customer) {

        logger.info("update customer called" + customer);
        String message = StatusMessage.STATUS_FAILED;
        try {
            User user = customer.getUser();
            if (user != null && user.getUserId() > 0 && customer != null && customer.getCustomerId() > 0 && customer.getName().trim().length() > 2) {
                //update customer details
                Integer i = customerDAO.updateCustomer(customer);
                if (i != null && i > 0) {
                    //update user details
                    Integer count = userDAO.editUser(user);
                    if (count != null && count > 0) {
                        message = StatusMessage.STATUS_SUCCESS;
                        logger.info("user pdated");
                        logger.info("Customer record updated");
                    } else {
                        logger.info("User updation failed");
                        message = "User updation failed please try again";
                    }
                }
            } else {
                message = "Customer information requrired";
            }
        } catch (DataAccessException ex) {
            logger.error("Error in update custoemr" + ex.getMessage());
            message = StatusMessage.STATUS_FAILED;
        } catch (Exception ex) {
            logger.error("Error in update custoemr" + ex.getMessage());
            message = StatusMessage.STATUS_FAILED;
        }
        logger.info("Returned message from update customer " + message);
        return message;
    }

}
