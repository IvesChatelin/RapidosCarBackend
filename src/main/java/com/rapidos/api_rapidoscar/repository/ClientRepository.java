package com.rapidos.api_rapidoscar.repository;

import com.rapidos.api_rapidoscar.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    UserDetails findByUsername(String username);
}
