package com.springBootApi.domains;

import com.springBootLibrary.entitys.BaseEntity;
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
    private static final long serialVersionUID = -19385454577507296L;

    private String firstName;
    private String lastName;
    @ManyToMany(mappedBy = "owners")
    private List<Store> stores = new ArrayList<>();
}
