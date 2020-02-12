////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.services;

import com.springBootApi.Dtos.CustomerDto;
import com.springBootApi.domains.Customer;
import com.springBootLibrary.services.BaseCrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends BaseCrudServiceImpl<Customer, CustomerDto> implements ICustomerService {
    public CustomerService() {
        super(Customer.class, CustomerDto.class);
    }

}
