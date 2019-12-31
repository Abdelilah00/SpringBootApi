package com.example.demo.controllers;

import com.example.demo.domains.BaseEntity;
import com.example.demo.services.IBaseCrudService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BaseCrudController<T extends BaseEntity> {

    private IBaseCrudService<T> _service;

    public BaseCrudController(IBaseCrudService<T> _service) {
        this._service = _service;
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
    public T Post(@RequestBody T customer) {
        return _service.save(customer);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public T Put(@RequestBody T customer) {
        return _service.save(customer);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void Delete(@RequestBody T customer) {
        _service.delete(customer);
    }
}
