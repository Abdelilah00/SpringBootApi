package com.springBootApi.Dtos;

import com.springBootLibrary.entitys.IdEntity;
import lombok.Data;

@Data
public class StoreDto extends IdEntity {
    private String firstName;
    private String lastName;
}
