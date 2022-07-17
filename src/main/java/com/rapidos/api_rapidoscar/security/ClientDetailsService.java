package com.rapidos.api_rapidoscar.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface ClientDetailsService {

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
