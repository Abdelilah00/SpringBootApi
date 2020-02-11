////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.controllers;

import com.springBootApi.Dtos.OwnerDto;
import com.springBootApi.domains.Owner;
import com.springBootApi.domains.Store;
import com.springBootLibrary.controllers.BaseCrudController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("api/admin/owners")
public class OwnersController extends BaseCrudController<Owner, OwnerDto> {
    public OwnersController() {
        super(Owner.class, OwnerDto.class);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/withStore")
    public OwnerDto withStore(@RequestBody OwnerDto dto) {
        var owner = objectMapper.convertToEntity(dto);
        var store = new Store();
        store.setName(dto.getStoreName());
        owner.setStores(Collections.singletonList(store));
        var xx = service.save(owner);
        return objectMapper.convertToDto(xx);
    }
}
