package com.springBootLibrary;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class EntityMapping<TEntity, TDto> {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private Class<TEntity> entityClass;
    @Autowired
    private Class<TDto> dtoClass;

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
        return modelMapper.map(entity, dtoClass);
    }

    protected TEntity convertToEntity(TDto dto) {
        return modelMapper.map(dto, entityClass);
    }
}
