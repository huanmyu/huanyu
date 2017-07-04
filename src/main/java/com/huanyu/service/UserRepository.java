package com.huanyu.service;

import org.springframework.data.repository.CrudRepository;

import com.huanyu.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{
	User findByUsernameAndPassword(String username, String password);
}
