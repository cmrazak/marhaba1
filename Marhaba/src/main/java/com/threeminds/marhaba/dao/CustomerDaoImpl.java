package com.threeminds.marhaba.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.threeminds.marhaba.model.Customer;

@Transactional
@Repository("customerDao")
public class CustomerDaoImpl extends AbstractDao<Integer, Customer> implements CustomerDao {

	@Override
	public void save(Customer customer) {

		persist(customer);

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

}
