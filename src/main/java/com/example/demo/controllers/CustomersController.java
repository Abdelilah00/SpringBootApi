package com.example.demo.controllers;

import com.example.demo.domains.Customer;
import com.example.demo.services.IBaseCrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api")
@RequestMapping("api/customers")
public class CustomersController extends BaseCrudController<Customer> {
    public CustomersController(IBaseCrudService<Customer> service) {
        super(service);
    }
}

