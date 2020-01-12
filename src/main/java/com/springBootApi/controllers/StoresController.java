package com.springBootApi.controllers;

import com.springBootApi.domains.Store;
import com.springBootLibrary.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/admin/stores")
public class StoresController extends BaseCrudController<Store> {
}
