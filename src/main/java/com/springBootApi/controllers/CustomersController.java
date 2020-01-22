package com.springBootApi.controllers;

import com.springBootApi.Dtos.CustomerDto;
import com.springBootApi.domains.Customer;
import com.springBootLibrary.controllers.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user/customers")
public class CustomersController extends BaseCrudController<Customer, CustomerDto> {
}

