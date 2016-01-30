package com.threeminds.marhaba.service;

import com.threeminds.marhaba.model.User;
import com.threeminds.marhaba.model.UserCredential;

public interface UserService {

	void saveUser(UserCredential userCredential);

	UserCredential getCredential();

	User loginUser(String userLoginId, String loginPassword);
	
	User findUser(String name);
}
