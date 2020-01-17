package com.springBootApi.controllers;

import com.springBootApi.domains.Customer;
import com.springBootLibrary.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user/customers")
public class CustomersController extends BaseCrudController<Customer> {

}

