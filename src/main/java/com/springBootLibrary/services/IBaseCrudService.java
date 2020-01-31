package com.springBootLibrary.services;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.scheduling.annotation.Async;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface IBaseCrudService<TEntity> {
    @Async
    CompletableFuture<List<TEntity>> findAll();

    @Async
    CompletableFuture<List<TEntity>> findAll(Sort sort);

    @Async
    CompletableFuture<List<TEntity>> findAll(Example<TEntity> example);

    @Async
    CompletableFuture<List<TEntity>> findAll(Example<TEntity> example, Sort sort);

    @Async
    CompletableFuture<Page<TEntity>> findAll(Pageable pageable);

    @Async
    CompletableFuture<List<TEntity>> saveAll(Iterable<TEntity> entities);

    CompletableFuture<TEntity> saveAndFlush(TEntity entity);

    void deleteInBatch(Iterable<TEntity> entities);

    void deleteAllInBatch();

    @Transactional
    CompletableFuture<TEntity> getOne(Long aLong);

    @Async
    CompletableFuture<TEntity> save(TEntity entity);

    @Async
    CompletableFuture<Optional<TEntity>> findById(Long aLong);

    void deleteById(Long aLong);

    void delete(TEntity entity);

    void deleteAll(Iterable<? extends TEntity> entities);

    void deleteAll();

    @Async
    CompletableFuture<Optional<TEntity>> findOne(Example<TEntity> example);

    @Async
    CompletableFuture<Page<TEntity>> findAll(Example<TEntity> example, Pageable pageable);
}
