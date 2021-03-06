////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.services;

import com.springBootApi.Dtos.Owners.OwnerCreateDto;
import com.springBootApi.Dtos.Owners.OwnerDto;
import com.springBootApi.Dtos.Owners.OwnerUpdateDto;
import com.springBootApi.domains.Owner;
import com.springBootApi.domains.Store;
import com.springBootLibrary.services.BaseCrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OwnerService extends BaseCrudServiceImpl<Owner, OwnerDto, OwnerCreateDto, OwnerUpdateDto> implements IOwnerService {
    public OwnerService() {
        super(Owner.class, OwnerDto.class, OwnerCreateDto.class, OwnerUpdateDto.class);
    }

    public OwnerCreateDto withStore(OwnerCreateDto dto) {
        var owner = objectMapper.convertToEntity(dto);
        owner.setTenantId(2L);
        var store = new Store();
        store.setTenantId(2L);
        store.setName(dto.getStoreName());
        store.setOwner(owner);
        owner.getStores().add(store);
        return objectMapper.convertToDto(repository.save(owner), OwnerCreateDto.class);
    }
}
