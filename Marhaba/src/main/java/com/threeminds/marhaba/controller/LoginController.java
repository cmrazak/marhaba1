package com.threeminds.marhaba.controller;



import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.threeminds.marhaba.model.User;
import com.threeminds.marhaba.service.UserService;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String verifyLogin(@RequestParam String userId,@RequestParam String password, HttpSession session){
		
		User user=userService.loginUser(userId, password);
		if(user==null){
			return "redirect:/";
		}
		session.setAttribute("loggedInUser", user);
		return "mainPage";
	}
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String verifyLogin(HttpSession session){
				
		if(session!=null && session.isNew()){
			logger.info("New User accessing...");
			return "redirect:/";
		}
		return "mainPage";
	}
}
