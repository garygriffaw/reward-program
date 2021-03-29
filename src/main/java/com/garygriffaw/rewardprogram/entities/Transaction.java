package com.garygriffaw.rewardprogram.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private double amount;

    public Transaction() {
    }

    public int calculateRewardPoints() {
        int intAmount = (int) amount;

        if (intAmount < 51)
            return 0;

        if (intAmount < 101)
            return intAmount - 50;

        return 50 + ((intAmount - 100) * 2);
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
