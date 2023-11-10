package com.example.bank.Service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.CustomerRepository;
import com.example.bank.Model.Customer;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	public Customer addNewCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	public Iterable<Customer> allCustomers() {
		return customerRepository.findAll();
	}
	public void deleteById(int id) {
		customerRepository.deleteById(id);
	}
	public Optional<Customer> customer(int id) {
		return customerRepository.findById(id);
	}
}
