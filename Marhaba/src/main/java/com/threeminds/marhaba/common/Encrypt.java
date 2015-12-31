package com.threeminds.marhaba.common;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;

@Component
public class Encrypt {

	public  String getHashKey(String value) {
		return BCrypt.hashpw(value, BCrypt.gensalt(1));
	}

	public  boolean equals(String passwod, String hashKey) {
		return BCrypt.checkpw(passwod, hashKey);
		
	}
}
