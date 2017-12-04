package com.jmk.dao;

import com.jmk.beans.User;

public interface UserDAO {

    /**
     * This method create new user in to database
     *
     * @param user
     * @return Newly created userid, if creation failed then return null
     */
    public Integer createUser(User user);

    /**
     * Update existing user
     *
     * @param user
     * @return Return 1 on success and null if failes
     */
    public Integer editUser(User user);

    /**
     * This method fetch the user details from db of specific userName
     *
     * @param userName
     * @return
     */
    public User getUser(String userName);
}
