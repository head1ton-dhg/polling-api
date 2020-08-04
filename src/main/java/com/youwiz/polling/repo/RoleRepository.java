package com.youwiz.polling.repo;

import com.youwiz.polling.model.Role;
import com.youwiz.polling.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
