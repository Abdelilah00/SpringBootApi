package com.springBootLibrary.repositorys;

import com.springBootLibrary.entitys.IdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface IBaseJpaRepository<TEntity extends IdEntity> extends JpaRepository<TEntity, Serializable> {

}

