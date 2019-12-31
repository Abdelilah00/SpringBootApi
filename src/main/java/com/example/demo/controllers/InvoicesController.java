package com.example.demo.controllers;

import com.example.demo.domains.Invoice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Invoices")
public class InvoicesController extends BaseCrudController<Invoice> {
}
