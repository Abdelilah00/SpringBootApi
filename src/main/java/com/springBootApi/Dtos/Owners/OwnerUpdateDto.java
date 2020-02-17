package com.springBootApi.Dtos.Owners;

import com.springBootLibrary.models.BaseDto;

import javax.validation.constraints.NotBlank;

public class OwnerUpdateDto extends BaseDto {
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String storeName;
}
