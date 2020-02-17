package com.springBootApi.Dtos.Products;

import com.springBootLibrary.models.BaseDto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ProductCreateDto extends BaseDto {
    @NotBlank
    private String name;

    @NotNull
    @Min(0)
    private Long qtyStock;
}
