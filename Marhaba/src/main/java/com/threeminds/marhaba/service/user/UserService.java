package com.threeminds.marhaba.service.user;

import com.threeminds.marhaba.model.user.User;
import com.threeminds.marhaba.model.user.UserCredential;

public interface UserService {

	void saveUser(UserCredential userCredential);

	UserCredential getCredential();

	User loginUser(String userLoginId, String loginPassword);
	
	User findUser(String name);
}
