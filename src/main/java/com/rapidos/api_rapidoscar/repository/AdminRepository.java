package com.rapidos.api_rapidoscar.repository;

import com.rapidos.api_rapidoscar.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
}
