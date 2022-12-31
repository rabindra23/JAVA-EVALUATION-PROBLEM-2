package com.masai.webapp.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.webapp.example.entity.Email;
import com.masai.webapp.example.entity.User;
import com.masai.webapp.example.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repository;
	//List<User> users = new ArrayList<>();
	

	@Override
	public List<User> addUser(User user) {
		repository.save(user);
		return repository.findAll();
	}

	@Override
	public boolean deleteUser(int id) {
		repository.deleteById(id);
		return true;
	}

	@Override
	public List<User> getUsers() {
		//users.add(new User(13,"Rabindra","9876543210","23-08-2002",new Email("1","rabindra","rabi@gmail")));
		return repository.findAll();
		//return users;
	}

	@Override
	public User getUser(int id) {
		
		return repository.findById(id).get(id);
	}

}
