package com.springBootLibrary;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


public class BaseCrudController<T extends BaseEntity> {
    @Autowired
    private IBaseJpaRepository<T> _repository;

    /*
        @Async
    */
    @RequestMapping(method = RequestMethod.GET)
    public List<T> list() {
        return Lists.newArrayList(_repository.findAllActive());
    }

    /*
        @Async
    */
    @RequestMapping(method = RequestMethod.POST)
    public T create(@RequestBody T entity) {
        return _repository.save(entity);
    }

    /*
        @Async
    */
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public T update(@PathVariable(value = "id") long id, @RequestBody T entity) {
        return _repository.save(entity);
    }

    /*
        @Async
    */
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") long id) {
        _repository.softDelete(id);
    }

    /*
        @Async
    */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public T get(@PathVariable(value = "id") long id) {
        return _repository.getOne(id);
    }
}
