////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.services;

import com.springBootLibrary.services.IBaseCrudService;

public interface IOwnerService<Owner, OwnerDto> extends IBaseCrudService<Owner, OwnerDto> {
    OwnerDto withStore(OwnerDto dto);
}
