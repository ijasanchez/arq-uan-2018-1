package uan.edu.co.customer.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uan.edu.co.customer.manager.model.Customer;
import uan.edu.co.customer.manager.model.CustomerRepository;
import uan.edu.co.customer.manager.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService{
	
	
	@Autowired
	CustomerRepository repository;

	@Override
	public boolean save(Customer customer) {
		repository.save(customer);
		return true;
	}

	@Override
	public Iterable<Customer> retrieveCustomers() {
		return repository.findAll();
	}

	@Override
	public Iterable<Customer> retrieveCustomersByLastName(String lastName) {
		return repository.findByLastName(lastName);
	}

}
