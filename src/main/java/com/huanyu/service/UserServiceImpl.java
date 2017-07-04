package com.huanyu.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.huanyu.domain.User;

@Component("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User getUser(String username, String password) {
		return this.userRepository.findByUsernameAndPassword(username, password);
	}

	@Override
	public User saveUser(User user) {
		return this.userRepository.save(user);
	}
}
