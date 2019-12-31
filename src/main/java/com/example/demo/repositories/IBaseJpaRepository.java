package com.example.demo.repositories;

import com.example.demo.domains.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBaseJpaRepository<T extends BaseEntity> extends JpaRepository<T, Long> {

}

