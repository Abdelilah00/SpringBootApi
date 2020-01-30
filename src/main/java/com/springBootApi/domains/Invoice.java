package com.springBootApi.domains;

import com.springBootLibrary.entitys.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@Entity
public class Invoice extends BaseEntity {
    private static final long serialVersionUID = -1938567246027507296L;

    private String name;
    @ManyToOne
    private Customer customer;
}
