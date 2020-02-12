////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.domains;

import com.springBootLibrary.models.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class Owner extends BaseEntity {
    private static final long serialVersionUID = -19385454577507296L;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    /*@JoinTable(
            name = "store_owners",
            joinColumns = {@JoinColumn(name = "store_id")},
            inverseJoinColumns = {@JoinColumn(name = "owner_id")})*/
    private List<Store> stores = new ArrayList<>();

}
