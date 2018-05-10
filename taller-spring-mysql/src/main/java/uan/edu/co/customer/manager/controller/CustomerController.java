package uan.edu.co.customer.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uan.edu.co.customer.manager.model.Customer;
import uan.edu.co.customer.manager.service.ICustomerService;
import uan.edu.co.customer.manager.service.exception.ResourceNotFoundException;



@RestController
public class CustomerController {
	@Autowired
	ICustomerService customerService;
	
	@PostMapping("/save")
	public ResponseEntity<Boolean> save( @RequestBody Customer customer ){
		return new ResponseEntity<>(customerService.save(customer), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Customer> update( @RequestBody Customer customer ) throws ResourceNotFoundException{
		return new ResponseEntity<>(customerService.update(customer), HttpStatus.OK);
	}
	
	@GetMapping("/findall")
	public ResponseEntity<Iterable<Customer>>  findAll(){
		return new ResponseEntity<>(customerService.retrieveCustomers(), HttpStatus.OK);
	}
	
	@GetMapping("/findByLastName")
	public ResponseEntity<Iterable<Customer>>  findByLastName(@RequestParam String lastName){
		return new ResponseEntity<>(customerService.retrieveCustomersByLastName(lastName), HttpStatus.OK);
	}
}

