////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.services;

import com.springBootApi.Dtos.OwnerCreateDto;
import com.springBootApi.domains.Owner;
import com.springBootLibrary.services.IBaseCrudService;

public interface IOwnerService extends IBaseCrudService<Owner, OwnerCreateDto> {
    OwnerCreateDto withStore(OwnerCreateDto dto);
}
