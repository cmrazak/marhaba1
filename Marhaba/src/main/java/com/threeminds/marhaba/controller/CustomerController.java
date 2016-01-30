package com.threeminds.marhaba.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.threeminds.marhaba.model.Customer;
import com.threeminds.marhaba.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/customer/new", method = RequestMethod.GET)
	public String newCustomer(ModelMap model) {

		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		model.addAttribute("edit", false);
		model.addAttribute("regionList",customerService.getRegionList());
		return "customer/newCustomer";
	}

	@RequestMapping(value = "/customer/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer c, ModelMap model) {
		// model.put("customer", c);
		return "customer/newCustomer";
	}

	
}
