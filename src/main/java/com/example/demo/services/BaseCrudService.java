package com.example.demo.services;

import com.example.demo.domains.BaseEntity;
import com.example.demo.repositories.IBaseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BaseCrudService<T extends BaseEntity> implements IBaseCrudService<T> {
    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public List<T> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<T> findAllById(Iterable<Long> longs) {
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
        return null;
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
