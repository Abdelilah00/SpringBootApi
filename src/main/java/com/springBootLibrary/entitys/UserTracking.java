package com.springBootLibrary.entitys;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public abstract class UserTracking extends IdEntity implements Serializable {
    /*@CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
    private Date deletedAt = null;

    private long createdBy;
    private long updatedBy;
    private long deletedBy;*/
}

