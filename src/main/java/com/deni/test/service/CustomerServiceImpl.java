package com.deni.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deni.test.model.Customer;
import com.deni.test.repository.CustomerRepo;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
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
