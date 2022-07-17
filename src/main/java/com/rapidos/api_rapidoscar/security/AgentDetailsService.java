package com.rapidos.api_rapidoscar.security;

import org.springframework.security.core.userdetails.UserDetails;

public interface AgentDetailsService {

    UserDetails loadUserByLogin(String login);

}
