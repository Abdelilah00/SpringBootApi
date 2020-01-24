package com.springBootApi.domains;

import com.springBootLibrary.entitys.UserTracking;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class Store extends UserTracking {
    private static final long serialVersionUID = -1938567852507296L;

    private String name;
    @ManyToMany
    private List<Owner> owners = new ArrayList<>();
}
