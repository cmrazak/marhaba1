package com.threeminds.marhaba.dao;





import com.threeminds.marhaba.model.User;
import com.threeminds.marhaba.model.UserCredential;

public interface UserDao {
	void saveCredential(UserCredential userCredential);
	User findUserByNameEquals(String name);
}
	