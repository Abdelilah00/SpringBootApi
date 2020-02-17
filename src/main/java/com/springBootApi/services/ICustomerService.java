////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.services;

import com.springBootApi.Dtos.Customers.CustomerCreateDto;
import com.springBootApi.Dtos.Customers.CustomerDto;
import com.springBootApi.Dtos.Customers.CustomerUpdateDto;
import com.springBootApi.domains.Customer;
import com.springBootLibrary.services.IBaseCrudService;

public interface ICustomerService extends IBaseCrudService<Customer, CustomerDto, CustomerCreateDto, CustomerUpdateDto> {

}
