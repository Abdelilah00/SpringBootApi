package com.springBootLibrary;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface IBaseCrudService<T extends BaseEntity> {
    List<T> findAll();

    List<T> findAll(Sort sort);

    List<T> findAll(Example<T> example);

    List<T> findAll(Example<T> example, Sort sort);

    Page<T> findAll(Pageable pageable);

    List<T> saveAll(Iterable<T> entities);

    T saveAndFlush(T entity);

    void deleteInBatch(Iterable<T> entities);

    void deleteAllInBatch();

    T getOne(Long aLong);


    T save(T entity);

    Optional<T> findById(Long aLong);

    void deleteById(Long aLong);

    void delete(T entity);

    void deleteAll(Iterable<? extends T> entities);

    void deleteAll();

    Optional<T> findOne(Example<T> example);

    Page<T> findAll(Example<T> example, Pageable pageable);
}
