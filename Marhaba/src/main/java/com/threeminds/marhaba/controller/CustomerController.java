package com.threeminds.marhaba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.threeminds.marhaba.model.Customer;

@Controller
public class CustomerController {

	@RequestMapping(value="/customer/new",method=RequestMethod.GET)
	public String newCustomer(ModelMap model){
		
		Customer customer=new Customer();
		model.addAttribute("customer", customer);
		model.addAttribute("edit",false);
		return "customer/newCustomer";
	}
}
