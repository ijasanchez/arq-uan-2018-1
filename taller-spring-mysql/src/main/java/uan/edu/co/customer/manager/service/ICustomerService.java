package uan.edu.co.customer.manager.service;

import uan.edu.co.customer.manager.model.Customer;

public interface ICustomerService {
	
	/**
	 * 
	 * @param customer
	 * @return
	 */
	public boolean save(Customer customer);
	
	/**
	 * 
	 * @return
	 */
	public Iterable<Customer> retrieveCustomers();
	
	/**
	 * 
	 * @param lastName
	 * @return
	 */
	public Iterable<Customer> retrieveCustomersByLastName(String lastName);
	
}
