package com.threeminds.marhaba.dao.user;





import com.threeminds.marhaba.model.user.User;
import com.threeminds.marhaba.model.user.UserCredential;

public interface UserDao {
	void saveCredential(UserCredential userCredential);
	User findUserByNameEquals(String name);
}
	