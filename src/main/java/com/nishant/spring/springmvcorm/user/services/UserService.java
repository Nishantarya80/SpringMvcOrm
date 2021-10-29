package com.nishant.spring.springmvcorm.user.services;

import java.util.List;

import com.nishant.spring.springmvcorm.user.model.User;

public interface UserService {
	int save(User user); 
	List<User> getUser();
	User fetchUser(int id);
}
