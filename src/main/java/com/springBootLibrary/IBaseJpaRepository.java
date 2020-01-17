package com.springBootLibrary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface IBaseJpaRepository<T extends IdEntity> extends JpaRepository<T, Serializable> {

}

