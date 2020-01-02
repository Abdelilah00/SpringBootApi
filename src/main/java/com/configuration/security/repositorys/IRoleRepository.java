package com.configuration.security.repositorys;

import com.configuration.security.domains.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Long> {
}
