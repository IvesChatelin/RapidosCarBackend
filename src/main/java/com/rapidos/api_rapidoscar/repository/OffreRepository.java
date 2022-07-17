package com.rapidos.api_rapidoscar.repository;

import com.rapidos.api_rapidoscar.entity.Offrelocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffreRepository extends JpaRepository<Offrelocation, Integer> {
}
