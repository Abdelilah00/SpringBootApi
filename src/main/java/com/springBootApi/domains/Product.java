package com.springBootApi.domains;

import com.springBootLibrary.entitys.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseEntity {
    private static final long serialVersionUID = -193857221212507296L;

    private String name;
    @OneToMany(fetch = FetchType.LAZY)
    private List<InvoiceDetails> invoiceDetails = new ArrayList<>();
}
