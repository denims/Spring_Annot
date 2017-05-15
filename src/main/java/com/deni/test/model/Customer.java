package com.deni.test.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {

	private String customerFirstName;
	private String customerLastName;

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

}
