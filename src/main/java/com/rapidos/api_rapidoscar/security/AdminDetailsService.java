package com.rapidos.api_rapidoscar.security;

import org.springframework.security.core.userdetails.UserDetails;

public interface AdminDetailsService {

    UserDetails loadUserByUsername(String username);

}
