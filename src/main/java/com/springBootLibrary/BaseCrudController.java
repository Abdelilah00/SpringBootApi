package com.springBootLibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


public class BaseCrudController<T extends IdEntity> {
    @Autowired
    private IBaseJpaRepository<T> repository;

    /*
            @Async
        */
    @RequestMapping(method = RequestMethod.GET)
    public List<T> list() {
        return repository.findAll();
    }

    /*
        @Async
    */
    @RequestMapping(method = RequestMethod.POST)
    public T create(@RequestBody T entity) {
        return repository.save(entity);
    }

    /*
        @Async
    */
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public T update(@PathVariable(value = "id") long id, @RequestBody T entity) {
        return repository.save(entity);
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
    public T get(@PathVariable(value = "id") long id) {
        return repository.getOne(id);
    }
}
