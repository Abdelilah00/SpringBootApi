package com.springBootLibrary.services;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface IBaseCrudService<TEntity> {
    List<TEntity> findAll();

    List<TEntity> findAll(Sort sort);

    List<TEntity> findAll(Example<TEntity> example);

    List<TEntity> findAll(Example<TEntity> example, Sort sort);

    Page<TEntity> findAll(Pageable pageable);

    List<TEntity> saveAll(Iterable<TEntity> entities);

    TEntity saveAndFlush(TEntity entity);

    void deleteInBatch(Iterable<TEntity> entities);

    void deleteAllInBatch();

    TEntity getOne(Long aLong);

    TEntity save(TEntity entity);

    Optional<TEntity> findById(Long aLong);

    void deleteById(Long aLong);

    void delete(TEntity entity);

    void deleteAll(Iterable<? extends TEntity> entities);

    void deleteAll();

    Optional<TEntity> findOne(Example<TEntity> example);

    Page<TEntity> findAll(Example<TEntity> example, Pageable pageable);
}
