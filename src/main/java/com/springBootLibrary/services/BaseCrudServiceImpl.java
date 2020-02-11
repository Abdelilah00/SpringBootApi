////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootLibrary.services;

import com.springBootLibrary.models.BaseDto;
import com.springBootLibrary.models.BaseEntity;
import com.springBootLibrary.repositorys.IBaseJpaRepository;
import com.springBootLibrary.utilis.ModelEntityMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public class BaseCrudServiceImpl<TEntity extends BaseEntity, TDto extends BaseDto> implements IBaseCrudService<TEntity, TDto> {
    @Autowired
    protected IBaseJpaRepository<TEntity> repository;
    protected ModelEntityMapping<TEntity, TDto> objectMapper = new ModelEntityMapping<>();

    protected BaseCrudServiceImpl(Class<TEntity> tEntityClass, Class<TDto> tDtoClass) {
        objectMapper.setDtoClass(tDtoClass);
        objectMapper.setEntityClass(tEntityClass);
    }

    @Override
    public List<TDto> findAll() {
        return objectMapper.convertToDtoList(repository.findAll());
    }

    @Override
    public TDto getOne(Long aLong) {
        return null;
    }

    @Override
    public Page<TDto> findAll(Pageable pageable) {
        return (null);
    }

    @Override
    public TDto save(TDto entity) {
        return objectMapper.convertToDto(repository.save(objectMapper.convertToEntity(entity)));
    }

    @Override
    public TDto findById(Long aLong) {
        return objectMapper.convertToDto(repository.findById(aLong).get());
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public List<TDto> findAll(Sort sort) {
        return (null);
    }

    @Override
    public List<TDto> saveAll(Iterable<TDto> entities) {
        return (null);
    }

    @Override
    public TDto saveAndFlush(TDto entity) {
        return (null);
    }

    @Override
    public void deleteInBatch(Iterable<TDto> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public List<TDto> findAll(Example<TDto> example) {
        return (null);
    }

    @Override
    public List<TDto> findAll(Example<TDto> example, Sort sort) {
        return (null);
    }


    @Override
    public void delete(TDto entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends TDto> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Optional<TDto> findOne(Example<TDto> example) {
        return null;
    }

    @Override
    public Page<TDto> findAll(Example<TDto> example, Pageable pageable) {
        return (null);
    }
}
