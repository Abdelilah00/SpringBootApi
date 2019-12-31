package com.example.demo.domains;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class Owner extends BaseEntity {
    private String firstName;
    private String lastName;
    @ManyToMany(mappedBy = "owners")
    private List<Store> stores = new ArrayList<>();
}
