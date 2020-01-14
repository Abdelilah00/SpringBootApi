package com.springBootLibrary;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface IBaseCrudService<T extends BaseEntityId> {
    List<T> findAll();

    List<T> findAll(Sort sort);

    List<T> findAllById(Iterable<Long> longs);

    List<T> saveAll(Iterable<T> entities);

    T saveAndFlush(T entity);

    void deleteInBatch(Iterable<T> entities);

    void deleteAllInBatch();

    T getOne(Long aLong);

    List<T> findAll(Example<T> example);

    List<T> findAll(Example<T> example, Sort sort);

    Page<T> findAll(Pageable pageable);

    T save(T entity);

    Optional<T> findById(Long aLong);

    void deleteById(Long aLong);

    void delete(T entity);

    void deleteAll(Iterable<? extends T> entities);

    void deleteAll();

    Optional<T> findOne(Example<T> example);

    Page<T> findAll(Example<T> example, Pageable pageable);
}
