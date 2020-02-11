////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.services;

import com.springBootApi.Dtos.OwnerDto;
import com.springBootApi.domains.Owner;
import com.springBootApi.domains.Store;
import com.springBootLibrary.services.BaseCrudServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class OwnerService extends BaseCrudServiceImpl<Owner, OwnerDto> {
    public OwnerService() {
        super(Owner.class, OwnerDto.class);
    }

    public OwnerDto withStore(OwnerDto dto) {
        var owner = objectMapper.convertToEntity(dto);
        var store = new Store();
        store.setName(dto.getStoreName());
        owner.setStores(Collections.singletonList(store));
        return objectMapper.convertToDto(repository.save(owner));
    }
}
