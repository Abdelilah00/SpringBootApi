////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.controllers;

import com.springBootApi.Dtos.OwnerDto;
import com.springBootApi.domains.Owner;
import com.springBootLibrary.controllers.BaseCrudController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/admin/owners")
public class OwnersController extends BaseCrudController<Owner, OwnerDto> {


    @RequestMapping(method = RequestMethod.POST, path = "/withStore")
    public OwnerDto withStore(@Valid @RequestBody OwnerDto dto) {
        //Todo: Add withStore to interface of IBaseCrudService of this instance
/*
        return service.withStore(dto);
*/
        return null;
    }
}
