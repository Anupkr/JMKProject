package com.jmk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmk.beans.User;
import com.jmk.dao.UserDAO;
import com.jmk.util.StatusMessage;
import org.springframework.dao.DataAccessException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public String createUser(User user) {

        return null;
    }

    public String login(User user) {
        return null;
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
