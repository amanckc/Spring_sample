package com.aman.repository;

import java.util.ArrayList;
import java.util.List;
import com.aman.model.Customer;

public class HibernateCustomerRepoImpl implements CustomerRepo {

	/* (non-Javadoc)
	 * @see com.aman.repository.CustomerRepo#findAll()
	 */
	public List<Customer> findAll(){
		Customer customer=new Customer();
		List<Customer> customers=new ArrayList<Customer>();
		customer.setFirstname("aman");
		customer.setLastname("singh");
		
		customers.add(customer);
		
		return customers;
		
				
		
		
	}
}
