package com.threeminds.marhaba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.threeminds.marhaba.model.UserCredential;
import com.threeminds.marhaba.service.UserService;

@Controller
@Scope("request")
@RequestMapping(value = "/user")

public class UserController {
	@Autowired
	UserService userService;
	

	@RequestMapping(value = "new", method = RequestMethod.POST)
	public String newUser(@ModelAttribute("userCredential") UserCredential userCredential) {

		//userCredential.setPasswordHash(encrypt.getHashKey(userCredential.getPasswordHash().trim()));
		userService.saveUser(userCredential);
		return "result";
	}

}
