////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.services;

import com.springBootApi.Dtos.OwnerDto;
import com.springBootApi.domains.Owner;
import com.springBootLibrary.services.IBaseCrudService;

public interface IOwnerService extends IBaseCrudService<Owner, OwnerDto> {
    OwnerDto withStore(OwnerDto dto);
}
