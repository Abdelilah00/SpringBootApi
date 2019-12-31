package com.springBootApi.web;

import com.springBootApi.domains.Product;
import com.springBootLibrary.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Products")
public class ProductsController extends BaseCrudController<Product> {
}
