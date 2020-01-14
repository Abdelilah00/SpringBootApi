package com.springBootLibrary;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface IBaseJpaRepository<T extends BaseEntityId> extends JpaRepository<T, Serializable> {

}

