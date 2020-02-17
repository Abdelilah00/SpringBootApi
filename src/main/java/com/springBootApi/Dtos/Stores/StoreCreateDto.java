package com.springBootApi.Dtos.Stores;

import com.springBootApi.Dtos.Products.ProductDto;
import com.springBootLibrary.models.BaseDto;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
class StoreCreateDto extends BaseDto {
    private String name;

    private List<ProductDto> products = new ArrayList<>();
}
