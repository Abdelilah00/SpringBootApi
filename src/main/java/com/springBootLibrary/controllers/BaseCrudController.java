////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootLibrary.controllers;

import com.springBootLibrary.models.IdEntity;
import com.springBootLibrary.services.IBaseCrudService;
import com.springBootLibrary.utilis.ModelEntityMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class BaseCrudController<TEntity extends IdEntity, TDto> extends ModelEntityMapping<TEntity, TDto> {

    @Autowired
    private IBaseCrudService<TEntity> service;

    public BaseCrudController(Class<TEntity> tEntityClass, Class<TDto> tDtoClass) {
        super(tEntityClass, tDtoClass);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<TDto> getAll() throws ExecutionException, InterruptedException {
        var x = service.findAll();
        return convertToDtoList(x).get();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public TEntity getOne(@PathVariable(value = "id") long id) {
        var x = service.getOne(id);
        return x;
    }

    @RequestMapping(method = RequestMethod.POST)
    public TDto create(@Valid @RequestBody TDto dto) {
        var x = convertToEntity(dto);
        var xx = service.save(x);
        return convertToDto(xx);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public TDto update(@PathVariable(value = "id") long id, @Valid @RequestBody TDto dto) {
/*
        assert id == dto.getId():"Id Not Equals";
*/
        var x = convertToEntity(dto);
        var xx = service.save(x);
        return convertToDto(xx);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") long id) {
        service.deleteById(id);
    }
}
