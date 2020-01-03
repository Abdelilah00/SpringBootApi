package com.springBootApi.web;

import com.springBootApi.domains.Owner;
import com.springBootLibrary.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/owners")
public class OwnersController extends BaseCrudController<Owner> {
}
