package com.springBootLibrary.entitys;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.MappedSuperclass;
import java.sql.Date;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
@MappedSuperclass
@FilterDef(name = "tenantFilter", parameters = {@ParamDef(name = "tenantId", type = "string")}, defaultCondition = "tenantId = :tenantId")
public abstract class BaseEntity extends IdEntity {

    private String tenantId;

    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
    private Date deletedAt = null;

    private String createdBy;
    private String updatedBy;
    private String deletedBy;
}

