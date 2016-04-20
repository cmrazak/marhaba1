package com.threeminds.marhaba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.threeminds.marhaba.model.Customer;
import com.threeminds.marhaba.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/customer/viewall", method = RequestMethod.GET)
	public String viewAllCustomer(ModelMap model) {
		List<Customer> customerList = customerService.findAllCustomer();
		model.addAttribute("customerList", customerList);
		return "customer/customerList";
	}

	@RequestMapping(value = "/customer/new", method = RequestMethod.GET)
	public String newCustomer(ModelMap model) {

		model.addAttribute("customer", new Customer());
		model.addAttribute("edit", false);
		model.addAttribute("regionList", customerService.getRegionList());
		return "customer/newCustomer";
	}

	@RequestMapping(value = "/customer/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer customer, ModelMap model) {
		// model.put("customer", c);
		//String key=(String)model..get("edit");
		
		customerService.saveNewCustomer(customer);
		model.clear();
		model.addAttribute("customer", new Customer());
		model.addAttribute("edit", false);
		model.addAttribute("regionList", customerService.getRegionList());
		return "customer/newCustomer";
	}

	@RequestMapping(value = "/customer/sigle", method = RequestMethod.GET)
	public String getSingleCustomer(ModelMap model, @RequestParam long customerId) {
		Customer customer = customerService.findCustomerById(customerId);
		model.addAttribute("customer", customer);
		model.addAttribute("edit", true);
		model.addAttribute("regionList", customerService.getRegionList());
		return "customer/editCustomer";
	}

	@RequestMapping(value = "/customer/edit")
	public ModelAndView updateCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.updateCutomer(customer);
		return new ModelAndView("redirect:/customer/viewall");
		//return "customer/customerList";
	}

}
