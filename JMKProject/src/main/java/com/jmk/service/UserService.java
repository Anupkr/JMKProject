package com.jmk.service;

import com.jmk.beans.User;

public interface UserService {

    public String createUser(User user);

    public String login(User user);

    public String editUser(User user);
}
