package com.springBootApi.domains;

import com.springBootLibrary.entitys.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@Entity
public class Store extends BaseEntity {
    private static final long serialVersionUID = -1938567852507296L;

    private String name;
    @ManyToMany
    private List<Owner> owners = new ArrayList<>();
}
