package com.garygriffaw.rewardprogram.services;

import com.garygriffaw.rewardprogram.entities.Customer;
import com.garygriffaw.rewardprogram.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAll() {
        return (List<Customer>) customerRepository.findAll();
    }
}
