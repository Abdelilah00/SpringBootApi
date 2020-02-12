////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.services;

import com.springBootApi.Dtos.ProductDto;
import com.springBootApi.domains.Product;
import com.springBootLibrary.services.BaseCrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends BaseCrudServiceImpl<Product, ProductDto> implements IProductService {
    public ProductService() {
        super(Product.class, ProductDto.class);
    }
}

