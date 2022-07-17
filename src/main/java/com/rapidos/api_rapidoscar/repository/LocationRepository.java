package com.rapidos.api_rapidoscar.repository;

import com.rapidos.api_rapidoscar.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
}
