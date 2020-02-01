package com.springBootLibrary.controllers;

import com.springBootLibrary.entitys.IdEntity;
import com.springBootLibrary.services.IBaseCrudService;
import com.springBootLibrary.utilis.ModelEntityMapping;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        var x = service.findAll().get();
        return convertToDtoList(x).get();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public TDto getOne(@PathVariable(value = "id") long id) throws ExecutionException, InterruptedException {
        var x = service.getOne(id);
        return convertToDto(x.get());
    }

    @RequestMapping(method = RequestMethod.POST)
    public TDto create(@RequestBody TDto dto) throws ExecutionException, InterruptedException {
        var x = convertToEntity(dto);
        var xx = service.save(x).get();
        return convertToDto(xx);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public TDto update(@PathVariable(value = "id") long id, @RequestBody TDto dto) throws ExecutionException, InterruptedException {
/*
        assert id == dto.getId():"Id Not Equals";
*/
        var x = convertToEntity(dto);
        var xx = service.save(x).get();
        return convertToDto(xx);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") long id) {
        service.deleteById(id);
    }
}
