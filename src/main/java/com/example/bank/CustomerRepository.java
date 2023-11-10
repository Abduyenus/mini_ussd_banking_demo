package com.example.bank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bank.Model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
