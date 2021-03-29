package com.garygriffaw.rewardprogram.dto;

import java.time.YearMonth;
import java.util.Map;

public class CustomerRewardsDto {

    private String customerDisplayName;

    private int totalRewards;

    private Map<YearMonth, Integer> monthlyRewards;

    // Getters and Setters

    public String getCustomerDisplayName() {
        return customerDisplayName;
    }

    public void setCustomerDisplayName(String customerDisplayName) {
        this.customerDisplayName = customerDisplayName;
    }

    public int getTotalRewards() {
        return totalRewards;
    }

    public void setTotalRewards(int totalRewards) {
        this.totalRewards = totalRewards;
    }

    public Map<YearMonth, Integer> getMonthlyRewards() {
        return monthlyRewards;
    }

    public void setMonthlyRewards(Map<YearMonth, Integer> monthlyRewards) {
        this.monthlyRewards = monthlyRewards;
    }
}
