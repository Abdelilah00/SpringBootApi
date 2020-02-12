////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.services;

import com.springBootApi.Dtos.ProductDto;
import com.springBootApi.domains.Product;
import com.springBootLibrary.services.IBaseCrudService;

public interface IProductService extends IBaseCrudService<Product, ProductDto> {
}
