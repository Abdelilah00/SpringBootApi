////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.services;

import com.springBootApi.Dtos.OwnerCreateDto;
import com.springBootApi.domains.Owner;
import com.springBootApi.domains.Store;
import com.springBootLibrary.services.BaseCrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OwnerService extends BaseCrudServiceImpl<Owner, OwnerCreateDto> implements IOwnerService {
    public OwnerService() {
        super(Owner.class, OwnerCreateDto.class);
    }

    public OwnerCreateDto withStore(OwnerCreateDto dto) {
        var owner = objectMapper.convertToEntity(dto);
        owner.setTenantId(2L);
        var store = new Store();
        store.setTenantId(2L);
        store.setName(dto.getStoreName());
        store.setOwner(owner);
        owner.getStores().add(store);
        return objectMapper.convertToDto(repository.save(owner));
    }
}
