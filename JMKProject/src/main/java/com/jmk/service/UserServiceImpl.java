package com.jmk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmk.beans.User;
import com.jmk.dao.UserDAO;
import com.jmk.util.StatusMessage;
import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;

@Service
public class UserServiceImpl implements UserService {

    Logger logger = Logger.getLogger(UserServiceImpl.class);
    @Autowired
    private UserDAO userDAO;

    @Override
    public String createUser(User user) {

        return null;
    }

    @Override
    public String login(User user) {

        String message;
        try {
            if (user != null && user.getUserName() != null && user.getUserName().length() > 0 && user.getPassword() != null && user.getPassword().length() > 0) {

                user = userDAO.getUser(user.getUserName());
                if (user.getPassword().equalsIgnoreCase(user.getPassword())) {
                    message = StatusMessage.STATUS_SUCCESS;
                } else {
                    message = "Invalid username or password";
                }
            } else {
                message = "Username and password required";
            }
        } catch (EmptyResultDataAccessException ex) {
            message = "Invalid username or password";
            logger.error(ex);

        } catch (DataAccessException ex) {
            message = "Somthing went wrong ! please try again";
            logger.error(ex);
        } catch (Exception ex) {
            message = "Somthing went wrong ! please try again";
            logger.error(ex);
        }

        return message;
    }

    @Override
    public String editUser(User user) {
        String message = StatusMessage.STATUS_FAILED;
        try {
            if (user != null) {
                Integer count = userDAO.editUser(user);
                if (count != null && count > 0) {
                    message = StatusMessage.STATUS_SUCCESS;
                }
            }
        } catch (DataAccessException ex) {

        } catch (Exception ex) {

        }
        return message;
    }
}
