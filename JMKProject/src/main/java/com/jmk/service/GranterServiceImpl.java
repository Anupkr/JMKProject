package com.jmk.service;

//import com.jmk.dao.GranterDAO;
import com.jmk.beans.Granter;
import com.jmk.beans.User;
import com.jmk.dao.GranterDAO;
import com.jmk.dao.UserDAO;
import com.jmk.util.StatusMessage;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

/**
 *
 * @author anup
 */
@Service
public class GranterServiceImpl implements GranterService {

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private GranterDAO granterDAO;

    @Override
    public String createGranter(Granter granter) {
        String message = StatusMessage.STATUS_FAILED;
        if (granter != null && granter.getUser() != null) {
            User user = granter.getUser();
            try {
                if (granter.getName() != null && user.getMobile1() != null && user.getPassword() != null) {
                    Integer userId = userDAO.createUser(user);
                    if (userId != null && userId > 0) {
                        //set newly create userId
                        granter.getUser().setUserId(userId);
                        //Save Granter Information in Granter table
                        Integer granterId = granterDAO.createGranter(granter);
                        if (granterId != null && granterId > 0) {
                            System.out.println("Granter Creation Succsessfully");
                        } else {
                            System.out.println("GranterId Creation failed");
                        }
                    } else {
                        System.out.println("User Creation failed");
                    }
                } else {
                    message = "Mobile , Password and Granter name Required";
                }
            } catch (DataAccessException e) {
                System.out.println(e);
                message = "Granter Creation Failed, Please try again";
            } catch (Exception e) {
                message = "Granter Creation Failed, Please try again";
            }
        } else {

        }
        return message;
    }

    @Override
    public List<Granter> getAllGranter() {
        return granterDAO.getAllGranter();
    }

    @Override
    public Granter getGranter(Integer granterId) {
        return null;
    }

    @Override
    public Granter getGranter(String mobile) {
        return null;
    }
}
