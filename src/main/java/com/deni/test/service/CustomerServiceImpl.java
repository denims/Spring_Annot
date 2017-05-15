package com.deni.test.service;

import java.util.List;

import com.deni.test.model.Customer;
import com.deni.test.repository.CustomerRepo;
import com.deni.test.repository.CustomerRepoImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepo customerRepo;
	

	public CustomerServiceImpl(CustomerRepo customerRepo) {
		super();
		this.customerRepo = customerRepo;
	}

	@Override
	public List<Customer> getAll() {
		return customerRepo.getall();
	}

	public CustomerRepo getCustomerRepo() {
		return customerRepo;
	}

	public void setCustomerRepo(CustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
	}

}
