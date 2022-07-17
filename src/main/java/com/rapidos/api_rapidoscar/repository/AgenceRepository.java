package com.rapidos.api_rapidoscar.repository;

import com.rapidos.api_rapidoscar.entity.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenceRepository extends JpaRepository<Agence, Integer> {

}
