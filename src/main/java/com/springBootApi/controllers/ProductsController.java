////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.controllers;

import com.springBootApi.Dtos.Products.ProductCreateDto;
import com.springBootApi.Dtos.Products.ProductDto;
import com.springBootApi.Dtos.Products.ProductUpdateDto;
import com.springBootApi.domains.Product;
import com.springBootLibrary.controllers.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user/products")
public class ProductsController extends BaseCrudController<Product, ProductDto, ProductCreateDto, ProductUpdateDto> {
}
