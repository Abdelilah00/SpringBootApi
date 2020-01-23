package com.springBootLibrary.controllers;

import com.springBootLibrary.entitys.IdEntity;
import com.springBootLibrary.repositorys.IBaseJpaRepository;
import com.springBootLibrary.utilis.EntityMapping;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class BaseCrudController<TEntity extends IdEntity, TDto> extends EntityMapping<TEntity, TDto> {

    //@Qualifier("IProductRepository")
    @Autowired
    private IBaseJpaRepository<TEntity> repository;

    public BaseCrudController(Class<TEntity> tEntityClass, Class<TDto> tDtoClass) {
        super(tEntityClass, tDtoClass);
    }

    /*
            @Async
        */
    @RequestMapping(method = RequestMethod.GET)
    public List<TDto> list() {
        var x = repository.findAll();
        return convertToDtoList(x);
    }

    /*
        @Async
    */
    @RequestMapping(method = RequestMethod.POST)
    public TDto create(@RequestBody TDto dto) {
        var x = convertToEntity(dto);
        var xx = repository.save(x);
        return convertToDto(xx);
    }

    /*
        @Async
    */
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public TDto update(@PathVariable(value = "id") long id, @RequestBody TDto dto) {
        var x = convertToEntity(dto);
        var xx = repository.save(x);
        return convertToDto(xx);
    }

    /*
        @Async
    */
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") long id) {
        repository.deleteById(id);
    }

    /*
        @Async
    */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public TDto get(@PathVariable(value = "id") long id) {
        var x = repository.getOne(id);
        return convertToDto(x);
    }
}
