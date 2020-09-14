package cn.com.newloading.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.newloading.bean.User;
import cn.com.newloading.dao.UserDao;
import cn.com.newloading.service.UserService;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User findUserByName(String name) {
		// TODO Auto-generated method stub
		return this.userDao.findByUsername(name);
	}

}
