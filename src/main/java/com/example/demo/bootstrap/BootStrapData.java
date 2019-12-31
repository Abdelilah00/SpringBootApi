package com.example.demo.bootstrap;

import com.example.demo.domains.Customer;
import com.example.demo.domains.Invoice;
import com.example.demo.repositories.IBaseJpaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private IBaseJpaRepository<Invoice> _repoInvocie;
    private IBaseJpaRepository<Customer> _repoCustomer;

    public BootStrapData(IBaseJpaRepository<Invoice> repoInvocie, IBaseJpaRepository<Customer> repoCustomer) {
        _repoInvocie = repoInvocie;
        _repoCustomer = repoCustomer;
    }


    @Override
    public void run(String... args) throws Exception {
        /*Customer customer = new Customer();
        customer.setLastName("Dehaoui");
        customer.setFirstName("Abdelilah");

        Invoice invoice = new Invoice();
        invoice.setName("AA");
        invoice.setCustomer(customer);

        _repoCustomer.save(customer);
        _repoInvocie.save(invoice);*/
        _repoInvocie.findAll();
    }
}
