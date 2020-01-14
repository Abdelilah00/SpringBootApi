package com.springBootApi.services;

import com.springBootApi.domains.Customer;
import com.springBootLibrary.IBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerService extends IBaseCrudService<Customer> {

}
