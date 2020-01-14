package com.springBootLibrary;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@MappedSuperclass
public abstract class BaseEntityDto extends BaseEntityId implements Serializable {

}
