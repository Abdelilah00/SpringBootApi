////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.springBootApi.repositorys;

import com.springBootApi.domains.Owner;
import com.springBootLibrary.repositorys.IBaseJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOwnerRepository extends IBaseJpaRepository<Owner> {

}
