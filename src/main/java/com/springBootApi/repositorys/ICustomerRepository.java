package com.springBootApi.repositorys;

import com.springBootApi.domains.Product;
import com.springBootLibrary.repositorys.IBaseJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends IBaseJpaRepository<Product> {

}
