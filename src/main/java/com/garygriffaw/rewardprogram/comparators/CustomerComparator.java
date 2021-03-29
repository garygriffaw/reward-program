package com.garygriffaw.rewardprogram.comparators;

import com.garygriffaw.rewardprogram.entities.Customer;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getDisplayName().compareTo(o2.getDisplayName());
    }
}
