package com.threeminds.marhaba.service;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threeminds.marhaba.dao.CustomerDao;
import com.threeminds.marhaba.model.Customer;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao dao;

	@Override
	public Map<String, String> getRegionList() {

		Map<String, String> region = new LinkedHashMap<String, String>();
		region.put("DXB", "Dubai");
		region.put("SHJ", "Sharja");
		return region;
	}

	@Override
	public void saveNewCustomer(Customer customer) {
		dao.save(customer);

	}

	@Override
	public List<Customer> findAllCustomer() {

		return dao.findAllCustomers();
	}

	@Override
	public Customer findCustomerById(long customerId) {
		return dao.findById(customerId);
	}

	@Override
	public void updateCutomer(Customer customer) {
		Customer entity=dao.findById(customer.getId());
		if(entity!=null){
			entity.setName(customer.getName());
			entity.setArea(customer.getArea());
			entity.setRegion(customer.getRegion());
			entity.setPoBox(customer.getPoBox());
			entity.setPhoneNumber(customer.getPhoneNumber());
			dao.edit(customer);
		}
	}

}
