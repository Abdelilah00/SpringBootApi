package com.springBootApi.web;

import com.springBootApi.domains.Customer;
import com.springBootLibrary.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Customers")
public class CustomersController extends BaseCrudController<Customer> {
}

