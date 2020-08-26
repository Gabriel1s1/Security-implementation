package com.Example.Auditoria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Example.Auditoria.models.User;
import com.Example.Auditoria.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	public User save(User user) {
		return repository.save(user);
	}

}
