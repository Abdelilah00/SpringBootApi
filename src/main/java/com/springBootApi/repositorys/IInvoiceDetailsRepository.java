package com.springBootApi.repositorys;

import com.springBootApi.domains.InvoiceDetails;
import com.springBootLibrary.IBaseJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInvoiceDetailsRepository extends IBaseJpaRepository<InvoiceDetails> {

}
