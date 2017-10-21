package com.jmk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmk.beans.User;
import com.jmk.dao.UserDAO;
import com.jmk.util.StatusMessage;

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

}
