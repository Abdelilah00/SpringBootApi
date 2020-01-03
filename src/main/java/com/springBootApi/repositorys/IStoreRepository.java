package com.springBootApi.repositorys;

import com.springBootApi.domains.Store;
import com.springBootLibrary.IBaseJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStoreRepository extends IBaseJpaRepository<Store> {

}
