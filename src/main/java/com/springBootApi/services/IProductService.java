////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.services;

import com.springBootApi.Dtos.Products.ProductCreateDto;
import com.springBootApi.Dtos.Products.ProductDto;
import com.springBootApi.Dtos.Products.ProductUpdateDto;
import com.springBootApi.domains.Product;
import com.springBootLibrary.services.IBaseCrudService;

public interface IProductService extends IBaseCrudService<Product, ProductDto, ProductCreateDto, ProductUpdateDto> {
}
