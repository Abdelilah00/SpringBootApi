package com.springBootLibrary.utilis;

import com.springBootLibrary.entitys.IdEntity;
import org.modelmapper.ModelMapper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.util.Assert;

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

    protected TDto convertToDto(TEntity entity) {
        Assert.notNull(entity, "null Entity");
        return map(entity, dtoClass);
    }

    protected TEntity convertToEntity(TDto dto) {
        Assert.notNull(dto, "null dto");
        return map(dto, entityClass);
    }
}
