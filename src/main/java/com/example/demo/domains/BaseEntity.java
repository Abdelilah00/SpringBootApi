package com.example.demo.domains;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

 /*   @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt = null;
    private Date deletedAt = null;

    private long createdBy;
    private long updatedBy;
    private long deletedBy;*/
}
