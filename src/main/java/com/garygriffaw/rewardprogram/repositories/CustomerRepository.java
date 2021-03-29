package com.garygriffaw.rewardprogram.repositories;

import com.garygriffaw.rewardprogram.entities.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
