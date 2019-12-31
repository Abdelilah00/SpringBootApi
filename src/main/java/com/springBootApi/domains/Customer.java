package com.springBootApi.domains;

import com.springBootLibrary.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;


@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class Customer extends BaseEntity {
    private static final long serialVersionUID = -193856758757507296L;

    private String firstName;
    private String lastName;
}
