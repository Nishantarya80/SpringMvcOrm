package com.nishant.spring.springmvcorm.user.services.Impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;
import com.nishant.spring.springmvcorm.user.dao.UserDao;
import com.nishant.spring.springmvcorm.user.model.User;
import com.nishant.spring.springmvcorm.user.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int save(User user) {
		//Bussness logic
		return dao.create(user);
	}

	@Override
	public List<User> getUser() {
		//Bussness logic
		List<User> User = dao.findUser();
		Collections.sort(User);
		return User;
	}
	
	@Override
	public User fetchUser(int id) {
		return dao.finduser(id);
	}
}
