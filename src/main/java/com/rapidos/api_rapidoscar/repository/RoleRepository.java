package com.rapidos.api_rapidoscar.repository;

import com.rapidos.api_rapidoscar.entity.Role;
import com.rapidos.api_rapidoscar.models.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByName(RoleName rolename);
}
