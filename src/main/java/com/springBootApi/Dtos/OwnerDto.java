package com.springBootApi.Dtos;

import com.springBootLibrary.BaseDto;
import lombok.Data;

@Data
public class OwnerDto extends BaseDto {
    private String firstName;
    private String lastName;
}

