package com.springBootApi.repositorys;

import com.springBootApi.domains.Invoice;
import com.springBootLibrary.IBaseJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInvoiceRepository extends IBaseJpaRepository<Invoice> {

}

