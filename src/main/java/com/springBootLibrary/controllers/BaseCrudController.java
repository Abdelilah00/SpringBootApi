////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootLibrary.controllers;

import com.configuration.Exception.UserFriendlyException;
import com.springBootLibrary.models.BaseDto;
import com.springBootLibrary.models.IdEntity;
import com.springBootLibrary.services.IBaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;
import java.util.concurrent.ExecutionException;

public abstract class BaseCrudController<TEntity extends IdEntity, TDto extends BaseDto> {

    @Autowired
    protected IBaseCrudService<TEntity, TDto> service;

    @RequestMapping(method = RequestMethod.GET)
    protected List<TDto> getAll() throws ExecutionException, InterruptedException {
        return service.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    protected TDto getById(@PathVariable(value = "id") long id) throws InterruptedException {
        return service.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    protected TDto create(@Valid @RequestBody TDto dto) {
        return service.save(dto);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    protected TDto update(@PathVariable(value = "id") long id, @Valid @RequestBody TDto dto) throws UserFriendlyException {
        if (id != dto.getId())
            throw new UserFriendlyException("Id and model not equals");

        return service.save(dto);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    protected void delete(@PathVariable(value = "id") long id) {
        service.deleteById(id);
    }
}
