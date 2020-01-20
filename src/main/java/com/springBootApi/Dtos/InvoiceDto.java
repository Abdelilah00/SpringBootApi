package com.springBootApi.Dtos;

import com.springBootLibrary.models.IdEntity;
import lombok.Data;

@Data
public class InvoiceDto extends IdEntity {
    private String firstName;
    private String lastName;
}
