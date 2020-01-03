package com.springBootApi.repositorys;

import com.springBootApi.domains.Customer;
import com.springBootLibrary.IBaseJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends IBaseJpaRepository<Customer> {

}
