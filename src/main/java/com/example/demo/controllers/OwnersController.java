package com.example.demo.controllers;

import com.example.demo.domains.Owner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Owners")
public class OwnersController extends BaseCrudController<Owner> {
}
