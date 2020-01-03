package com.springBootApi.web;

import com.springBootApi.domains.Invoice;
import com.springBootLibrary.BaseCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/invoices")
public class InvoicesController extends BaseCrudController<Invoice> {
}
