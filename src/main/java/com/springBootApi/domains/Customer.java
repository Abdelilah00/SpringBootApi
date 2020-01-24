package com.springBootApi.domains;

import com.springBootLibrary.entitys.UserTracking;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;


@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class Customer extends UserTracking {
    private static final long serialVersionUID = -193856758757507296L;
    private String firstName;
    private String lastName;
}
