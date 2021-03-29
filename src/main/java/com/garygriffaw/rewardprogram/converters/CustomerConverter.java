package com.garygriffaw.rewardprogram.converters;

import com.garygriffaw.rewardprogram.dto.CustomerRewardsDto;
import com.garygriffaw.rewardprogram.entities.Customer;
import com.garygriffaw.rewardprogram.entities.Transaction;
import org.springframework.stereotype.Component;
import static java.util.stream.Collectors.*;

import java.time.YearMonth;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomerConverter {

    public CustomerRewardsDto entityToCustomerRewardsDto(Customer customer) {
        CustomerRewardsDto dto = new CustomerRewardsDto();

        dto.setCustomerDisplayName(customer.getDisplayName());
        dto.setTotalRewards(customer.getTransactions().stream()
                .collect(summingInt(e -> e.calculateRewardPoints())));
        dto.setMonthlyRewards(customer.getTransactions().stream()
                .collect(groupingBy(e -> YearMonth.from(e.getDate()), summingInt(e -> e.calculateRewardPoints()))));

        return dto;
    }

    public List<CustomerRewardsDto> entityListToCustomerRewardsDtoList(List<Customer> customers) {
        return customers.stream().map(x -> entityToCustomerRewardsDto(x)).collect(Collectors.toList());
    }
}
