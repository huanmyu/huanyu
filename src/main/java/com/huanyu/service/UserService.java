package com.huanyu.service;

import com.huanyu.domain.User;

public interface UserService {
	User getUser(String username, String password);
	
	User saveUser(User user);
}
