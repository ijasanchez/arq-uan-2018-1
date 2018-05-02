package uan.edu.co.customer.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uan.edu.co.customer.manager.model.Customer;
import uan.edu.co.customer.manager.model.CustomerRepository;



@RestController
public class CustomerController {
	@Autowired
	CustomerRepository repository;
	
	@PutMapping("/save")
	public ResponseEntity<Boolean> process( @RequestBody Customer customer ){
		repository.save(customer);
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
	
	@GetMapping("/findall")
	public ResponseEntity<Iterable<Customer>>  findAll(){
		return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/findByLastName")
	public ResponseEntity<List<Customer>>  findByLastName(@RequestParam String lastName){
		return new ResponseEntity<>(repository.findByLastName(lastName), HttpStatus.OK);
	}
}

