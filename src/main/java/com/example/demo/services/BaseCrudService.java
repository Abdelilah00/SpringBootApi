package com.example.demo.services;

import com.example.demo.domains.BaseEntity;
import com.example.demo.repositories.IBaseJpaRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BaseCrudService<T extends BaseEntity> implements IBaseCrudService<T> {
    private IBaseJpaRepository<T> _repository;

    public BaseCrudService(IBaseJpaRepository<T> repository) {
        _repository = repository;
    }


    public List<T> findAll() {
        return _repository.findAll();
    }

    public List<T> findAll(Sort sort) {
        return null;
    }

    public List<T> findAllById(Iterable<Long> longs) {
        return null;
    }

    public List<T> saveAll(Iterable<T> entities) {
        return null;
    }

    public T saveAndFlush(T entity) {
        return null;
    }

    public void deleteInBatch(Iterable<T> entities) {

    }

    public void deleteAllInBatch() {

    }

    public T getOne(Long aLong) {
        return null;
    }

    public List<T> findAll(Example<T> example) {
        return null;
    }

    public List<T> findAll(Example<T> example, Sort sort) {
        return null;
    }

    public Page<T> findAll(Pageable pageable) {
        return null;
    }

    public T save(T customer) {
        return _repository.save(customer);
    }

    public Optional<T> findById(Long aLong) {
        return _repository.findById(aLong);
    }

    public void deleteById(Long aLong) {

    }

    public void delete(T entity) {

    }

    public void deleteAll(Iterable<? extends T> entities) {

    }

    public void deleteAll() {

    }

    public Optional<T> findOne(Example<T> example) {
        return Optional.empty();
    }

    public Page<T> findAll(Example<T> example, Pageable pageable) {
        return null;
    }
}
