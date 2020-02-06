package com.springBootLibrary.services;

import com.springBootLibrary.entitys.BaseEntity;
import com.springBootLibrary.repositorys.IBaseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class BaseCrudServiceImpl<TEntity extends BaseEntity> implements IBaseCrudService<TEntity> {

    @Autowired
    private IBaseJpaRepository<TEntity> repository;

    @Override
    public CompletableFuture<List<TEntity>> findAll() {
        return CompletableFuture.completedFuture(repository.findAll());
    }

    @Override
    public CompletableFuture<List<TEntity>> findAll(Sort sort) {
        return CompletableFuture.completedFuture(null);
    }

    @Override
    public CompletableFuture<List<TEntity>> saveAll(Iterable<TEntity> entities) {
        return CompletableFuture.completedFuture(null);
    }

    @Override
    public CompletableFuture<TEntity> saveAndFlush(TEntity entity) {
        return CompletableFuture.completedFuture(null);
    }

    @Override
    public void deleteInBatch(Iterable<TEntity> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public CompletableFuture<TEntity> getOne(Long aLong) {
        return CompletableFuture.completedFuture(repository.getOne(aLong));
    }

    @Override
    public CompletableFuture<List<TEntity>> findAll(Example<TEntity> example) {
        return CompletableFuture.completedFuture(null);
    }

    @Override
    public CompletableFuture<List<TEntity>> findAll(Example<TEntity> example, Sort sort) {
        return CompletableFuture.completedFuture(null);
    }

    @Override
    public CompletableFuture<Page<TEntity>> findAll(Pageable pageable) {
        return CompletableFuture.completedFuture(null);
    }

    @Override
    public CompletableFuture<TEntity> save(TEntity entity) {
        return CompletableFuture.completedFuture(repository.save(entity));
    }

    @Override
    public CompletableFuture<Optional<TEntity>> findById(Long aLong) {
        return CompletableFuture.completedFuture(Optional.ofNullable(repository.getOne(aLong)));
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    @Override
    public void delete(TEntity entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends TEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public CompletableFuture<Optional<TEntity>> findOne(Example<TEntity> example) {
        return CompletableFuture.completedFuture(Optional.empty());
    }

    @Override
    public CompletableFuture<Page<TEntity>> findAll(Example<TEntity> example, Pageable pageable) {
        return CompletableFuture.completedFuture(null);
    }
}
