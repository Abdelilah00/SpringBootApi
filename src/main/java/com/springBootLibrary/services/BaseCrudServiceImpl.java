package com.springBootLibrary.services;

import com.springBootLibrary.entitys.IdEntity;
import com.springBootLibrary.repositorys.IBaseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Async
public class BaseCrudServiceImpl<TEntity extends IdEntity> implements IBaseCrudService<TEntity> {

    @Autowired
    private IBaseJpaRepository<TEntity> repository;

    @Override
    public CompletableFuture<List<TEntity>> findAll() {
        return CompletableFuture.completedFuture(repository.findAll());
    }

    @Override
    public List<TEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<TEntity> saveAll(Iterable<TEntity> entities) {
        return null;
    }

    @Override
    public TEntity saveAndFlush(TEntity entity) {
        return null;
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
    public List<TEntity> findAll(Example<TEntity> example) {
        return null;
    }

    @Override
    public List<TEntity> findAll(Example<TEntity> example, Sort sort) {
        return null;
    }

    @Override
    public Page<TEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public CompletableFuture<TEntity> save(TEntity entity) {
        return CompletableFuture.completedFuture(repository.save(entity));
    }

    @Override
    public Optional<TEntity> findById(Long aLong) {
        return Optional.ofNullable(repository.getOne(aLong));
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
    public Optional<TEntity> findOne(Example<TEntity> example) {
        return Optional.empty();
    }

    @Override
    public Page<TEntity> findAll(Example<TEntity> example, Pageable pageable) {
        return null;
    }
}
