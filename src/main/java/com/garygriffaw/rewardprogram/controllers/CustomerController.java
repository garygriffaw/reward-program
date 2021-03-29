package com.garygriffaw.rewardprogram.controllers;

import com.garygriffaw.rewardprogram.comparators.CustomerComparator;
import com.garygriffaw.rewardprogram.converters.CustomerConverter;
import com.garygriffaw.rewardprogram.dto.CustomerRewardsDto;
import com.garygriffaw.rewardprogram.entities.Customer;
import com.garygriffaw.rewardprogram.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerConverter customerConverter;

    @Autowired
    CustomerService customerService;

    @GetMapping("/rewards")
    public String displayCustomerRewards(Model model) {

        Comparator comparator = new CustomerComparator();

        List<Customer> customers = customerService.getAll();
        Collections.sort(customers, comparator);
        List<CustomerRewardsDto> customerRewardsDto = customerConverter.entityListToCustomerRewardsDtoList(customers);
        model.addAttribute("customerRewardsList", customerRewardsDto);

        return "customers/rewards";
    }
}
