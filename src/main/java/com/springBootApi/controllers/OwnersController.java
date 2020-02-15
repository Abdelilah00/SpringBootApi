////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.controllers;

import com.springBootApi.Dtos.OwnerCreateDto;
import com.springBootApi.domains.Owner;
import com.springBootApi.services.IOwnerService;
import com.springBootLibrary.controllers.BaseCrudController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/admin/owners")
public class OwnersController extends BaseCrudController<Owner, OwnerCreateDto> {
    @RequestMapping(method = RequestMethod.POST, path = "/withStore")
    public OwnerCreateDto withStore(@Valid @RequestBody OwnerCreateDto dto) {
        return ((IOwnerService) service).withStore(dto);
    }
}
