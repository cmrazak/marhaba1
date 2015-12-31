package com.threeminds.marhaba.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threeminds.marhaba.common.Encrypt;
import com.threeminds.marhaba.dao.user.UserDao;
import com.threeminds.marhaba.model.user.User;
import com.threeminds.marhaba.model.user.UserCredential;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;
	@Autowired
	private Encrypt encrypt;

	@Override
	public void saveUser(UserCredential userCredential) {
		dao.saveCredential(userCredential);
	}

	
	@Override
	public UserCredential getCredential() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public User loginUser(String userLoginId, String loginPassword) {
		
		User user=this.findUser(userLoginId);
		
		//List<Object>userList=dao.getUser(userCredential);
		if (user!=null) {
									
			if (encrypt.equals(loginPassword, user.getCredential().getUserLoginPassword())) {
				return user;
			}
		}
		
		return null;
	}

	@Override
	public User findUser(String name) {
		return dao.findUserByNameEquals(name);
	}

	

}
