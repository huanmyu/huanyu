package com.huanyu.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huanyu.domain.User;
import com.huanyu.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public User createUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
    public User getUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        return userService.getUser(username, password);
    }
}
