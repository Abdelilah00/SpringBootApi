////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.services;

import com.springBootApi.Dtos.Owners.OwnerCreateDto;
import com.springBootApi.Dtos.Owners.OwnerDto;
import com.springBootApi.Dtos.Owners.OwnerUpdateDto;
import com.springBootApi.domains.Owner;
import com.springBootLibrary.services.IBaseCrudService;

public interface IOwnerService extends IBaseCrudService<Owner, OwnerDto, OwnerCreateDto, OwnerUpdateDto> {
    OwnerCreateDto withStore(OwnerCreateDto dto);
}
