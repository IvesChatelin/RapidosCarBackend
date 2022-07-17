package com.rapidos.api_rapidoscar.repository;

import com.rapidos.api_rapidoscar.entity.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Integer> {
}
