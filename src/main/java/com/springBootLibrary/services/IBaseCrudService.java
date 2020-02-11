////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootLibrary.services;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

public interface IBaseCrudService<TEntity, TDto> {
    List<TDto> findAll() throws ExecutionException, InterruptedException;

    List<TDto> findAll(Sort sort);

    List<TDto> findAll(Example<TDto> example);

    List<TDto> findAll(Example<TDto> example, Sort sort);

    Page<TDto> findAll(Pageable pageable);

    List<TDto> saveAll(Iterable<TDto> entities);

    TDto saveAndFlush(TDto entity);

    void deleteInBatch(Iterable<TDto> entities);

    void deleteAllInBatch();

    TDto getOne(Long aLong);

    TDto save(TDto dto);

    Optional<TDto> findById(Long aLong);

    void deleteById(Long aLong);

    void delete(TDto entity);

    void deleteAll(Iterable<? extends TDto> entities);

    void deleteAll();

    Optional<TDto> findOne(Example<TDto> example);

    Page<TDto> findAll(Example<TDto> example, Pageable pageable);
}
