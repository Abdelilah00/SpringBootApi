package com.springBootApi.domains;

import com.springBootLibrary.entitys.BaseEntity;
import lombok.*;

import javax.persistence.Entity;


@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseEntity {
    private static final long serialVersionUID = -193856758757507296L;
    private String firstName;
    private String lastName;
}
