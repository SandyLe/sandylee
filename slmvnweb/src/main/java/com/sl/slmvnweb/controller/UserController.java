package com.sl.slmvnweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sl.slmvnweb.entity.User;
import com.sl.slmvnweb.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public String save(){
		User user = new User();
		user.setId(1l);
		user.setUsername("admin");
		user.setPassword("admin");
		userService.save(user);
	
		return "2";
	}
	

	@RequestMapping(value = "/getOne", method = RequestMethod.GET)
	public User getOne(@RequestParam(value = "id") Long id){
		User user = userService.findById(id);
	
		return user;
	}
	
}
