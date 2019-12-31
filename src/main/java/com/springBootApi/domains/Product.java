package com.springBootApi.domains;

import com.springBootLibrary.BaseEntity;
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
    private static final long serialVersionUID = -193857221212507296L;

    private String name;
    @OneToMany
    private List<InvoiceDetails> invoiceDetails = new ArrayList<>();
}
