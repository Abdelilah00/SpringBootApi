package com.springBootApi.controllers;

import com.springBootApi.Dtos.InvoiceDto;
import com.springBootApi.domains.Invoice;
import com.springBootLibrary.controllers.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user/invoices")
public class InvoicesController extends BaseCrudController<Invoice, InvoiceDto> {

}