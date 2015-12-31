package com.threeminds.marhaba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cutomer_department")
public class CustomerDepartment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",nullable=false,unique=true)
	private int id;
	
	@Column(name="customer_id",nullable=false)
	private long customerId;
	@Column(name="name",nullable=false, unique=true)
	private String departmentName;
	
	
	
	public CustomerDepartment() {
		
	}
	
	public CustomerDepartment(long customerId, String departmentName) {
		
		this.customerId = customerId;
		this.departmentName = departmentName;
	}

	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}
