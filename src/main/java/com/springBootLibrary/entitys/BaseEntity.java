package com.springBootLibrary.entitys;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.MappedSuperclass;
import java.sql.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
/*@FilterDef(name = "tenantFilter", parameters = {@ParamDef(name = "tenantId", type = "string")})
@Filter(name = "tenantFilter", condition = "tenant_id = :tenantId")*/
public abstract class BaseEntity extends IdEntity {

    private String tenantId;

    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
    private Date deletedAt = null;

    private long createdBy;
    private long updatedBy;
    private long deletedBy;
}

