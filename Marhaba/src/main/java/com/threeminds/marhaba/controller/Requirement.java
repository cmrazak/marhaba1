package com.threeminds.marhaba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.threeminds.marhaba.model.Customer;

@Controller
@RequestMapping("/requirement")
public class Requirement {

	@RequestMapping(value="/new",method=RequestMethod.GET)
	public String newPage(ModelMap model){
		
		Customer customer=new Customer();
		model.addAttribute("customer",customer);
		model.addAttribute("edit",false);
		return "requirement";
		
	}
}
