package com.aman.service;

import java.util.List;

import com.aman.model.Customer;
import com.aman.repository.CustomerRepo;
import com.aman.repository.HibernateCustomerRepoImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepo customerRepo;//=new HibernateCustomerRepoImpl();
	//constructor
	 public CustomerServiceImpl(CustomerRepo customerRepo) {
		// TODO Auto-generated constructor stub
	this.customerRepo=customerRepo;
	}

	@Override
	public List<Customer> findAll(){
		return customerRepo.findAll();
	}
	 
	//setter
	public void setCustomerRepo(CustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
	}
}
