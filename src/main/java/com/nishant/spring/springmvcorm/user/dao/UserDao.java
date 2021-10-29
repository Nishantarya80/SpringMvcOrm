package com.nishant.spring.springmvcorm.user.dao;

import java.util.List;

import com.nishant.spring.springmvcorm.user.model.User;

public interface UserDao {
	int create(User user);
	List<User> findUser();
	User finduser(int id);
}
