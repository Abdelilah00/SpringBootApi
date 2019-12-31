package com.springBootLibrary;

import com.springBootLibrary.BaseEntity;
import com.springBootLibrary.IBaseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class BaseCrudController<T extends BaseEntity> {
    @Autowired
    private IBaseJpaRepository<T> _service;

    @RequestMapping(method = RequestMethod.GET)
    public List<T> list() {
        return _service.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public T create(@RequestBody T entity) {
        return _service.save(entity);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public T update(@PathVariable(value = "id") long id, @RequestBody T entity) {
        return _service.save(entity);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") long id) {
        _service.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public T get(@PathVariable(value = "id") long id) {
        return _service.getOne(id);
    }
}
