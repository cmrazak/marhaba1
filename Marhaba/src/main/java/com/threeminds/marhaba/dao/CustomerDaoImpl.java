package com.threeminds.marhaba.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.threeminds.marhaba.model.Customer;

@Transactional
@Repository("customerDao")
public class CustomerDaoImpl extends AbstractDao<Long, Customer> implements CustomerDao {

	@Override
	public void save(Customer customer) {

		persist(customer);
	}
	@Override
	public void edit(Customer customer) {

		update(customer);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> findAllCustomers() {
		Criteria criteria = createEntityCriteria();
		return (List<Customer>) criteria.list();
	}

	@Override
	public Customer findCustomerById(long customerId) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("customer_id", customerId));
		return (Customer) criteria.uniqueResult();
	}

	@Override
	public Customer findById(long customerId) {
		return getByKey(customerId);
	}

}
