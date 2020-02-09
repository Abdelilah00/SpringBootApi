////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootLibrary.utilis;

import com.springBootLibrary.models.IdEntity;
import org.modelmapper.ModelMapper;
import org.springframework.scheduling.annotation.Async;

import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModelEntityMapping<TEntity extends IdEntity, TDto> extends ModelMapper {

    private Class<TEntity> entityClass;
    private Class<TDto> dtoClass;


    protected ModelEntityMapping(Class<TEntity> entityClass, Class<TDto> dtoClass) {
        this.entityClass = entityClass;
        this.dtoClass = dtoClass;
    }

    @Async
    protected CompletableFuture<List<TDto>> convertToDtoList(List<TEntity> entityList) {
        List<TDto> list = new ArrayList<>();
        for (TEntity entity : entityList) {
            TDto tDtoCompletableFuture = convertToDto(entity);
            list.add(tDtoCompletableFuture);
        }
        return CompletableFuture.completedFuture(list);
    }

    @Async
    protected CompletableFuture<List<TEntity>> convertToEntityList(List<TDto> dtoList) {
        List<TEntity> list = new ArrayList<>();
        for (TDto tDto : dtoList) {
            TEntity tEntityCompletableFuture = convertToEntity(tDto);
            list.add(tEntityCompletableFuture);
        }
        return CompletableFuture.completedFuture(list);
    }

    @Transactional
    protected TDto convertToDto(@NotNull TEntity entity) {
        return map(entity, dtoClass);
    }

    protected TEntity convertToEntity(@NotNull TDto dto) {
        return map(dto, entityClass);
    }
}
