package com.springBootApi.controllers;

import com.springBootApi.Dtos.OwnerDto;
import com.springBootLibrary.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/admin/owners")
public class OwnersController extends BaseCrudController<OwnerDto> {

}
