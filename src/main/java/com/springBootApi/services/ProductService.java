////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.services;

import com.springBootApi.Dtos.Products.ProductCreateDto;
import com.springBootApi.Dtos.Products.ProductDto;
import com.springBootApi.Dtos.Products.ProductUpdateDto;
import com.springBootApi.domains.Product;
import com.springBootLibrary.services.BaseCrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends BaseCrudServiceImpl<Product, ProductDto, ProductCreateDto, ProductUpdateDto> implements IProductService {
    public ProductService() {
        super(Product.class, ProductDto.class, ProductCreateDto.class, ProductUpdateDto.class);
    }
}

