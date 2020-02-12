////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.services;

import com.springBootApi.Dtos.CustomerDto;
import com.springBootApi.domains.Customer;
import com.springBootLibrary.services.IBaseCrudService;

public interface ICustomerService extends IBaseCrudService<Customer, CustomerDto> {

}
