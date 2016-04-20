package com.threeminds.marhaba.service;



import java.util.List;
import java.util.Map;

import com.threeminds.marhaba.model.Customer;

public interface CustomerService {
	Map<String, String> getRegionList();
	void saveNewCustomer(Customer customer);
	List<Customer> findAllCustomer();
	Customer findCustomerById(long customerId);
	void updateCutomer(Customer customer);
}
