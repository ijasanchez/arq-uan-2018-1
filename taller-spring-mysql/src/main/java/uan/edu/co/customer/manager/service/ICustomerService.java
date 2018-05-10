package uan.edu.co.customer.manager.service;

import uan.edu.co.customer.manager.model.Customer;
import uan.edu.co.customer.manager.service.exception.ResourceNotFoundException;

public interface ICustomerService {
	
	/**
	 * 
	 * @param customer
	 * @return
	 */
	public boolean save(Customer customer);
	
	/**
	 * 
	 * @param customerId
	 * @param customer
	 * @return
	 * @throws ResourceNotFoundException
	 */
	public Customer update(Customer customer) throws ResourceNotFoundException;
	
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
