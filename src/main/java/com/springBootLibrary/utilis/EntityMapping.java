package com.springBootLibrary.utilis;

import com.springBootLibrary.entitys.IdEntity;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class EntityMapping<TEntity extends IdEntity, TDto> extends ModelMapper {

    private Class<TEntity> entityClass;
    private Class<TDto> dtoClass;

    public EntityMapping(Class<TEntity> entityClass, Class<TDto> dtoClass) {
        this.entityClass = entityClass;
        this.dtoClass = dtoClass;
    }

    protected List<TDto> convertToDtoList(List<TEntity> entityList) {
        return entityList.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    protected List<TEntity> convertToEntityList(List<TDto> dtoList) {
        return dtoList.stream()
                .map(this::convertToEntity)
                .collect(Collectors.toList());
    }

    protected TDto convertToDto(TEntity entity) {
        return map(entity, dtoClass);
    }

    protected TEntity convertToEntity(TDto dto) {
        return map(dto, entityClass);
    }
}
