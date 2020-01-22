package com.springBootApi.Dtos;

import com.springBootLibrary.entitys.IdEntity;
import lombok.Data;

@Data
public class OwnerDto extends IdEntity {
    private String firstName;
    private String lastName;
}

