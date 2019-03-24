package com.aman.repository;

import java.util.List;

import com.aman.model.Customer;

public interface CustomerRepo {

	List<Customer> findAll();

}