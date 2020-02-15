////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.Dtos;

import com.springBootLibrary.models.BaseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class OwnerCreateDto extends BaseDto {
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String storeName;

    private List<StoreDto> stores = new ArrayList<>();

    public OwnerCreateDto(@NotBlank String firstName, @NotBlank String lastName, @NotBlank String storeName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.storeName = storeName;
    }
}
