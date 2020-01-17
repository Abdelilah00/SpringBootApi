package com.springBootLibrary;

import lombok.Data;

import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public abstract class BaseEntityDto extends IdEntity {

}
