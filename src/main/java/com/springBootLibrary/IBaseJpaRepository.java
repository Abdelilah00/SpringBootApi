package com.springBootLibrary;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface IBaseJpaRepository<T extends BaseEntity> extends JpaRepository<T, Serializable>, SoftDeletesRepository<T, Serializable> {

}

