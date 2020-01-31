package com.springBootLibrary.repositorys;

import com.springBootLibrary.entitys.IdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.util.List;

public interface IBaseJpaRepository<TEntity extends IdEntity> extends JpaRepository<TEntity, Serializable> {

    @Override
    @Query("select e from #{#entityName} e where e.deletedAt is null")
    List<TEntity> findAll();

    //Look up deleted entities
    @Query("select e from #{#entityName} e where e.deletedAt is not null")
    List<TEntity> recycleBin();


    @Override
    @Query("update #{#entityName} e set e.deletedAt=current_date where e.id=?1")
    @Modifying
    void deleteById(Serializable serializable);

   /* //Soft delete.
    @Modifying
    @Query("update #{#entityName} e set e.deletedAt=null where e.id=?1")
    public void deleteById(String id);*/
}

