package com.xiaowo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xiaowo.dao.IUserDao;
import com.xiaowo.dto.User;
import com.xiaowo.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;

	@Override
	public User getUserById(int userId) {
		return (User) userDao.queryByPrimaryKey(userId);
	}

	@Override
	public void insertUser(User user) {
		userDao.insertUser(user);

	}

	@Override
	public void addUser(User user) {
		userDao.insertUser(user);

	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

}
