package com.example.demo.controllers;

import com.example.demo.domains.BaseEntity;
import com.example.demo.services.IBaseCrudService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BaseCrudController<T extends BaseEntity> {
    private final IBaseCrudService<T> _service;

    public BaseCrudController(IBaseCrudService<T> service) {
        _service = service;
    }

    @GetMapping
    List<T> Get() {
        return _service.findAll();
    }

    @GetMapping("/{id}")
    T Get(@PathVariable Long id) {
        return _service.findById(id).get();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public T Post(@RequestBody T entity) {
        return _service.save(entity);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public T Put(@RequestBody T entity) {
        return _service.save(entity);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void Delete(@RequestBody T entity) {
        _service.delete(entity);
    }
}
