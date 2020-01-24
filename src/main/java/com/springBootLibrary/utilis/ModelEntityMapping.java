package com.springBootLibrary.utilis;

import com.springBootLibrary.entitys.IdEntity;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class ModelEntityMapping<TEntity extends IdEntity, TDto> extends ModelMapper {

    private Class<TEntity> entityClass;
    private Class<TDto> dtoClass;


    protected ModelEntityMapping(Class<TEntity> entityClass, Class<TDto> dtoClass) {
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
        //Assert.notNull(entity, "null Entity");
        return map(entity, dtoClass);
    }

    protected TEntity convertToEntity(TDto dto) {
        //Assert.notNull(dto, "null dto");
        return map(dto, entityClass);
    }
}
