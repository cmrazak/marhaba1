package com.threeminds.marhaba.dao;

import java.util.List;

import com.threeminds.marhaba.model.Customer;

public interface CustomerDao {

	void save(Customer customer);
	void edit(Customer customer);
	void delete();
	List<Customer> findAllCustomers();
	Customer findCustomerById(long customerId);
	Customer findById(long customerId);
	
}
