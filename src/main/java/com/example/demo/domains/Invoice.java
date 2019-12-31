package com.example.demo.domains;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class Invoice extends BaseEntity {
    private String name;
    @ManyToOne
    private Customer customer;
}
