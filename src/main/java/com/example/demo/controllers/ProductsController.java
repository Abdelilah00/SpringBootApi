package com.example.demo.controllers;

import com.example.demo.domains.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Products")
public class ProductsController extends BaseCrudController<Product> {
}
