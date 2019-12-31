package com.example.demo.controllers;

import com.example.demo.domains.Store;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Stores")
public class StoresController extends BaseCrudController<Store> {
}
