////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.Dtos.Stores;

import com.springBootApi.Dtos.Products.ProductDto;
import com.springBootLibrary.models.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class StoreDto extends BaseDto {
    private String name;

    private List<ProductDto> products = new ArrayList<>();
}

