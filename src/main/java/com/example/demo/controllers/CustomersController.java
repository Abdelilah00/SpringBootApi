package com.example.demo.controllers;

import com.example.demo.domains.*;
import com.example.demo.services.IBaseCrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Customers")
public class CustomersController extends BaseCrudController<Customer> {
}

