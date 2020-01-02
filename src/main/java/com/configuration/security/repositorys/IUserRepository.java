package com.configuration.security.repositorys;

import com.configuration.security.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
