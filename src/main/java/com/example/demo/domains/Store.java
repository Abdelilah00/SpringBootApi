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
public class Store extends BaseEntity {
    private String name;
    @ManyToMany
    private List<Owner> owners = new ArrayList<>();
}
