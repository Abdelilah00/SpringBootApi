package com.springBootApi.Dtos;

import com.springBootLibrary.BaseEntityDto;
import lombok.Data;

@Data
public class OwnerDto extends BaseEntityDto {
    private String firstName;
    private String lastName;
}
