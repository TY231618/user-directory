package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repository;

	@Override
	public List<User> getAll() {
		
		return (List<User>) repository.findAll();
	}

	@Override
	public User findOne(Long userId) {
		
		return repository.findOne(userId);
	}

	@Override
	public User addUser(User user) {
		
		User newUser = new User();
		newUser.setFirstname(user.getFirstname());
		newUser.setLastname(user.getLastname());
		newUser.setNationality(user.getNationality());
		newUser.setAge(user.getAge());
		
		return repository.save(newUser);
	}

	@Override
	public void removeUser(Long userId) {
		
		User user = repository.findOne(userId);
		
		repository.delete(user);
	}
	
}
