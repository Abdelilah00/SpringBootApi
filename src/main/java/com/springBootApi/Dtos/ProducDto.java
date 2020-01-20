package com.springBootApi.Dtos;

import com.springBootLibrary.models.IdEntity;
import lombok.Data;

@Data
public class ProducDto extends IdEntity {
    private String firstName;
    private String lastName;
}
