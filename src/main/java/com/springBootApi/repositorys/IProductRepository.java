package com.springBootApi.repositorys;

import com.springBootApi.domains.Product;
import com.springBootLibrary.IBaseJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends IBaseJpaRepository<Product> {

}
