////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.domains;

import com.springBootLibrary.models.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class Store extends BaseEntity {
    private static final long serialVersionUID = -1938567852507296L;
    @NotBlank
    private String name;

    @ManyToMany(mappedBy = "stores")
    private List<Owner> owners = new ArrayList<>();
}
