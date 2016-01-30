package com.threeminds.marhaba.dao;

import com.threeminds.marhaba.model.Customer;

public interface CustomerDao {

	void save(Customer customer);
	void delete();
}
