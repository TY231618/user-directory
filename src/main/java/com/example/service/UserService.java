package com.example.service;

import java.util.List;

import com.example.model.User;

public interface UserService {

	List<User> getAll();
	
	User findOne(Long userId);
	
	User addUser(User user);
	
	void removeUser(Long userId);
}
