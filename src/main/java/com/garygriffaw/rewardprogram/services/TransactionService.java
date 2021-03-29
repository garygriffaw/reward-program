package com.garygriffaw.rewardprogram.services;

import com.garygriffaw.rewardprogram.entities.Transaction;
import com.garygriffaw.rewardprogram.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    public Transaction save(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getAll() {
        return (List<Transaction>)transactionRepository.findAll();
    }
}
