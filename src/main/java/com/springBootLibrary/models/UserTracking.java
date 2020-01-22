package com.springBootLibrary.models;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public abstract class UserTracking implements Serializable {
    /* @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
    private Date deletedAt = null;

    private long createdBy;
    private long updatedBy;
    private long deletedBy;*/
}

