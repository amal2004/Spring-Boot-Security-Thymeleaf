package com.springboot.security.service;

import com.springboot.security.model.User;

public interface  UserService {
	
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
