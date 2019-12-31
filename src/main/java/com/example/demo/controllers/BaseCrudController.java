package com.example.demo.controllers;

import com.example.demo.domains.BaseEntity;
import com.example.demo.repositories.IBaseJpaRepository;
import com.example.demo.services.BaseCrudService;
import com.example.demo.services.IBaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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
