package com.example.demo.domains;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@MappedSuperclass
/*
@SQLDelete(sql = "UPDATE #{#entityName} SET deleted_at =   WHERE id = ?")
@Loader(namedQuery = "findById")
@NamedQuery(name = "findById", query = "SELECT t  FROM #{#entityName} t  WHERE  t.id = ?1 AND  t.deleted_at = false")
@Where(clause = "deletedAt = null")
*/

public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @CreationTimestamp
    private Date createdAt;
    private long createdBy;

    @UpdateTimestamp
    private Date updatedAt = null;
    private long updatedBy;

    private Date deletedAt = null;
    private long deletedBy;
}
