package com.threeminds.marhaba.common;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;

@Component
public class Encrypt {

	public  String getHashKey(String value) {
		return BCrypt.hashpw(value, BCrypt.gensalt(12));
	}

	public  boolean equals(String passwod, String hashKey) {
		
		return BCrypt.checkpw(passwod, hashKey);
		
	}
	public static void main(String s[]){
		String pw="razak123";
		Encrypt enc=new Encrypt();
		System.out.println(enc.getHashKey(pw));
	}
}
