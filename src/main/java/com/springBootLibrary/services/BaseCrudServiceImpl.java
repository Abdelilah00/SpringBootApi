////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootLibrary.services;

import com.configuration.TenantContext;
import com.springBootLibrary.models.BaseEntity;
import com.springBootLibrary.repositorys.IBaseJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public class BaseCrudServiceImpl<TEntity extends BaseEntity> implements IBaseCrudService<TEntity> {
    private static Logger logger = LoggerFactory.getLogger(TenantContext.class.getName());


    @Autowired
    private IBaseJpaRepository<TEntity> repository;

    @Override
    public List<TEntity> findAll() {
        return (repository.findAll());
    }

    @Override
    public List<TEntity> findAll(Sort sort) {
        return (null);
    }

    @Override
    public List<TEntity> saveAll(Iterable<TEntity> entities) {
        return (null);
    }

    @Override
    public TEntity saveAndFlush(TEntity entity) {
        return (null);
    }

    @Override
    public void deleteInBatch(Iterable<TEntity> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public TEntity getOne(Long aLong) throws EntityNotFoundException {
        return repository.getOne(aLong);
    }

    @Override
    public List<TEntity> findAll(Example<TEntity> example) {
        return (null);
    }

    @Override
    public List<TEntity> findAll(Example<TEntity> example, Sort sort) {
        return (null);
    }

    @Override
    public Page<TEntity> findAll(Pageable pageable) {
        return (null);
    }

    @Override
    public TEntity save(TEntity entity) {
        return (repository.save(entity));
    }

    @Override
    public Optional<TEntity> findById(Long aLong) {
        return (Optional.ofNullable(repository.getOne(aLong)));
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
        return (Optional.empty());
    }

    @Override
    public Page<TEntity> findAll(Example<TEntity> example, Pageable pageable) {
        return (null);
    }
}
