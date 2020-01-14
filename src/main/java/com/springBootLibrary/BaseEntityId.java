package com.springBootLibrary;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class BaseEntityId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
