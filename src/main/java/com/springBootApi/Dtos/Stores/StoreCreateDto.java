package com.springBootApi.Dtos.Stores;

import com.springBootApi.Dtos.Products.ProductDto;
import com.springBootLibrary.models.BaseDto;

import java.util.ArrayList;
import java.util.List;

public class StoreCreateDto extends BaseDto {
    private String name;

    private List<ProductDto> products = new ArrayList<>();
}
