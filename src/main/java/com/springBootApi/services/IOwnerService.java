package com.springBootApi.services;

import com.springBootApi.Dtos.OwnerDto;
import com.springBootLibrary.IBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public interface IOwnerService extends IBaseCrudService<OwnerDto> {

}
