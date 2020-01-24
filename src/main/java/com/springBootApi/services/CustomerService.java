package com.springBootApi.services;

import com.springBootApi.domains.Customer;
import com.springBootLibrary.services.BaseCrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends BaseCrudServiceImpl<Customer> {
}
