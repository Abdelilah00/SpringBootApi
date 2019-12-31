package com.example.demo.domains;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class InvoiceDetails extends BaseEntity {
    private String name;
    private int qte;
    @ManyToOne
    private Invoice invoice;
    @OneToOne
    private Product product;
}
