package com.garygriffaw.rewardprogram.repositories;

import com.garygriffaw.rewardprogram.entities.Transaction;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Long> {
}
