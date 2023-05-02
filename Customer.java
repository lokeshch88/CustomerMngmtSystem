package com.code;

import java.time.LocalDate;

public class Customer {
	private int custid;
	String firstName,lastName,email,password;
	double regAmt;
	LocalDate dob;
	ServicePlan plan;
	static int idGenerator;//auto generate id
	
	//two const 1 for all arg n 2 for prim key
	public Customer(String firstName, String lastName, String email, String password, double regAmt,
			LocalDate dob, ServicePlan plan) {
		super();
		
		this.custid = ++idGenerator;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.regAmt = regAmt;
		this.dob = dob;
		this.plan = plan;
	}
	
	public Customer(String email) {
		this.email=email;
	}
	
	//for prim key equality check
	@Override
	public boolean equals(Object o) {
		System.out.println("in customer equals");
		if(o instanceof Customer)
			return this.email.equals(((Customer) o).email);
		return false;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", regAmt=" + regAmt + ", dob=" + dob + ", plan=" + plan + "]";
	}
	
	
	
	

}
