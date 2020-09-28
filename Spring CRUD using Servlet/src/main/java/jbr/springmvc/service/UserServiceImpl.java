package jbr.springmvc.service;

import jbr.springmvc.dao.UserDao;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public class UserServiceImpl implements UserService{

	public UserDao userDao;
	
	public UserServiceImpl(UserDao userDao)
	{
		this.userDao=userDao;
	}
	
	public void register(User user) {
		
		userDao.register(user);
	}

	
	public User validateUser(Login login) {
	
		
		return userDao.validateUser(login);
	}

}
