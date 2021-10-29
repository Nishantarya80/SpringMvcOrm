package com.nishant.spring.springmvcorm.user.dao.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nishant.spring.springmvcorm.user.dao.UserDao;
import com.nishant.spring.springmvcorm.user.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int create(User user) {
		Integer result = (Integer) hibernateTemplate.save(user);
		return result;
	}

	@Override
	public List<User> findUser() {
		List<User> result = hibernateTemplate.loadAll(User.class);
		return result;
	}

	@Override
	public User finduser(int id) {
		return hibernateTemplate.get(User.class, id);
	}
	
}
