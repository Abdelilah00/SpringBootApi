package com.example.demo.domains;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;


@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class Customer extends BaseEntity {
    private String firstName;
    private String lastName;
}
