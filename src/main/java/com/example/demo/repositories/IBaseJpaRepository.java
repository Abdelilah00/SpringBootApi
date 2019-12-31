package com.example.demo.repositories;

import com.example.demo.domains.BaseEntity;
import com.example.demo.domains.Customer;
import com.example.demo.domains.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface IBaseJpaRepository<T extends BaseEntity> extends JpaRepository<T, Serializable> {

}

