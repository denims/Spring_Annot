package com.deni.test.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.deni.test.model.Customer;

@Repository("customerRepo")
public class CustomerRepoImpl implements CustomerRepo {
	@Autowired
	Customer customer;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/* (non-Javadoc)
	 * @see com.deni.test.repository.CustomerRepo#getall()
	 */
	@Override
	public List<Customer> getall(){
		List<Customer> cust = new ArrayList<>();
		customer.setCustomerFirstName("Deni");
		customer.setCustomerLastName("Simon");
		cust.add(customer);
		return cust;
	}

}
