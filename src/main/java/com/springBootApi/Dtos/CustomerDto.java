package com.springBootApi.Dtos;

import com.springBootLibrary.entitys.IdEntity;
import lombok.Data;

@Data
public class CustomerDto extends IdEntity {
    private String firstName;
    private String lastName;
}
