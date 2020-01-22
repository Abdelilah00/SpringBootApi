package com.springBootApi.controllers;

import com.springBootApi.Dtos.ProducDto;
import com.springBootApi.domains.Product;
import com.springBootLibrary.controllers.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user/products")
public class ProductsController extends BaseCrudController<Product, ProducDto> {

}
