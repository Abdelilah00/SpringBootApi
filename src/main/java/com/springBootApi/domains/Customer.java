package com.springBootApi.domains;

import com.springBootLibrary.entitys.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;


@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@Entity
public class Customer extends BaseEntity {
    private static final long serialVersionUID = -193856758757507296L;
    private String firstName;
    private String lastName;
}
