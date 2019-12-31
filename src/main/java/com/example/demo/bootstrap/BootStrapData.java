package com.example.demo.bootstrap;

import com.example.demo.domains.Customer;
import com.example.demo.repositories.IBaseJpaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final IBaseJpaRepository<Customer> _customerRepository;

    public BootStrapData(IBaseJpaRepository<Customer> customerRepository) {
        this._customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        //customerRepository.deleteById(1L);
    }
}
