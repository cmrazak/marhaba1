package com.threeminds.marhaba.dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.threeminds.marhaba.model.User;
import com.threeminds.marhaba.model.UserCredential;

@Transactional
@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, UserCredential> implements UserDao {

	private UserCredential credential;

	@Override
	public void saveCredential(UserCredential userCredential) {
		persist(userCredential);

	}

	public User findUser(String userId) {
		return null;
	}

	

	@SuppressWarnings("unused")
	@Override
	public User findUserByNameEquals(String name) {
		createQuery("from User U inner join U.credential as C where C.userLoginId=:username").setParameter("username",
				name);
		List<Object> userList = (List<Object>) executeQuery();
		Iterator<Object> iterator = userList.iterator();
		User user = null;
		UserCredential credential = null;
		while (iterator.hasNext()) {
			Object[] data=(Object[]) iterator.next();
			user = (User) data[0];
			credential = (UserCredential) data[1];
		}
		return user;

	}

	public UserCredential getCredential() {
		return credential;
	}

	public void setCredential(UserCredential credential) {
		this.credential = credential;
	}

}
