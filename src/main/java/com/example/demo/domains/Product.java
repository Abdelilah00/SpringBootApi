package com.example.demo.domains;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class Product extends BaseEntity {
    private String name;
    @OneToMany
    private List<InvoiceDetails> invoiceDetails = new ArrayList<>();
}
