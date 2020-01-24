package com.springBootLibrary.controllers;

import com.springBootLibrary.entitys.IdEntity;
import com.springBootLibrary.services.IBaseCrudService;
import com.springBootLibrary.utilis.ModelEntityMapping;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class BaseCrudController<TEntity extends IdEntity, TDto> extends ModelEntityMapping<TEntity, TDto> {

    @Autowired
    private IBaseCrudService<TEntity> service;

    public BaseCrudController(Class<TEntity> tEntityClass, Class<TDto> tDtoClass) {
        super(tEntityClass, tDtoClass);
    }


    @Async
    @RequestMapping(method = RequestMethod.GET)
    public CompletableFuture<List<TDto>> list() {
        var x = service.findAll();
        var xx = convertToDtoList(x);
        return CompletableFuture.completedFuture(xx);
    }

    @Async
    @RequestMapping(method = RequestMethod.POST)
    public CompletableFuture<TDto> create(@RequestBody TDto dto) {
        var x = convertToEntity(dto);
        var xx = service.save(x);
        return CompletableFuture.completedFuture(convertToDto(xx));
    }

    @Async
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public CompletableFuture<TDto> update(@PathVariable(value = "id") long id, @RequestBody TDto dto) {
        var x = convertToEntity(dto);
        var xx = service.save(x);
        return CompletableFuture.completedFuture(convertToDto(xx));
    }

    @Async
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") long id) {
        service.deleteById(id);
    }


    @Async
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public TDto get(@PathVariable(value = "id") long id) {
        var x = service.getOne(id);
        return convertToDto(x);
    }
}
