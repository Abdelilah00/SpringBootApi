package com.springBootApi.repositorys;

import com.springBootApi.domains.Owner;
import com.springBootLibrary.IBaseJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOwnerRepository extends IBaseJpaRepository<Owner> {

}
