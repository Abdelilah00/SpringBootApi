package com.springBootLibrary.services;

import com.springBootLibrary.entitys.IdEntity;
import com.springBootLibrary.repositorys.IBaseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.persistence.MappedSuperclass;
import java.util.List;
import java.util.Optional;

@MappedSuperclass
public class BaseCrudServiceImpl<T extends IdEntity> implements IBaseCrudService<T> {
    //@Qualifier("IProductRepository")
    @Autowired
    private IBaseJpaRepository<T> repository;

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public List<T> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<T> saveAll(Iterable<T> entities) {
        return null;
    }

    @Override
    public T saveAndFlush(T entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<T> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public T getOne(Long aLong) {
        return repository.getOne(aLong);
    }

    @Override
    public List<T> findAll(Example<T> example) {
        return null;
    }

    @Override
    public List<T> findAll(Example<T> example, Sort sort) {
        return null;
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public T save(T entity) {
        return null;
    }

    @Override
    public Optional<T> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends T> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Optional<T> findOne(Example<T> example) {
        return Optional.empty();
    }

    @Override
    public Page<T> findAll(Example<T> example, Pageable pageable) {
        return null;
    }
}
