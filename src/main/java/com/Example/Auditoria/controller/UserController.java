package com.Example.Auditoria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Example.Auditoria.models.User;
import com.Example.Auditoria.service.UserService;

@Controller
@RequestMapping("/home")
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public User save(User user ) {
		return service.save(user);
	}
	
}
