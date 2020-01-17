package com.springBootLibrary;

import lombok.Data;

import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public abstract class BaseEntity extends IdEntity {
 /*   @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
    private Date deletedAt = null;

    private long createdBy;
    private long updatedBy;
    private long deletedBy;*/
}

