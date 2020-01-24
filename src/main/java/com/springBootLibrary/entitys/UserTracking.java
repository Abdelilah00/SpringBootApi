package com.springBootLibrary.entitys;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public abstract class UserTracking extends IdEntity implements Serializable {
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
    private Date deletedAt = null;

    private long createdBy;
    private long updatedBy;
    private long deletedBy;
}

