package com.springBootApi.services;

import com.springBootApi.domains.Product;
import com.springBootLibrary.services.BaseCrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends BaseCrudServiceImpl<Product> {
}
