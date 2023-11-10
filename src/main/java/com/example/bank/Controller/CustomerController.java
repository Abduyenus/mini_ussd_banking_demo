package com.example.bank.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.Model.Customer;
import com.example.bank.Service.CustomerService;


@RestController
@RequestMapping(path = "api/v1/bank")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	public CustomerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@PostMapping("/addCustomer")
	public Customer registerNewCustomer(@RequestBody Customer customer) {
		System.out.println(customer);
		return customerService.addNewCustomer(customer);
	}
	@GetMapping("/customers")
	public Iterable<Customer> getAllCustomers() {
		return customerService.allCustomers();
	}
	@DeleteMapping("/customers/{Id}")
	public void removeCustomer(@PathVariable int Id) {
		customerService.deleteById(Id);
	}
	@GetMapping("/customers/{Id}")
	public Optional<Customer> getCustomer(@PathVariable int Id) {
		return customerService.customer(Id);
	}
}