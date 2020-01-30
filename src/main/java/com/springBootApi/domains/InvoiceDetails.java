package com.springBootApi.domains;

import com.springBootLibrary.entitys.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@Entity
public class InvoiceDetails extends BaseEntity {
    private static final long serialVersionUID = -19327445457556L;

    private String name;
    private int qte;
    @ManyToOne
    private Invoice invoice;
    @OneToOne
    private Product product;
}
