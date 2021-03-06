////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.controllers;

import com.springBootApi.Dtos.Customers.CustomerCreateDto;
import com.springBootApi.Dtos.Customers.CustomerDto;
import com.springBootApi.Dtos.Customers.CustomerUpdateDto;
import com.springBootApi.domains.Customer;
import com.springBootLibrary.controllers.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/admin/customers")
public class CustomersController extends BaseCrudController<Customer, CustomerDto, CustomerCreateDto, CustomerUpdateDto> {

}
