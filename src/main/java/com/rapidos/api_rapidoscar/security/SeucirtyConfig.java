package com.rapidos.api_rapidoscar.security;

import com.rapidos.api_rapidoscar.entity.Client;
import com.rapidos.api_rapidoscar.repository.AdminRepository;
import com.rapidos.api_rapidoscar.repository.AgenceRepository;
import com.rapidos.api_rapidoscar.repository.ClientRepository;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SeucirtyConfig extends WebSecurityConfigurerAdapter {

    private final ClientRepository clientRepository;
    private final AgenceRepository agenceRepository;
    private final AdminRepository adminRepository;

    public SeucirtyConfig(ClientRepository clientRepository, AgenceRepository agenceRepository, AdminRepository adminRepository) {
        this.clientRepository = clientRepository;
        this.agenceRepository = agenceRepository;
        this.adminRepository = adminRepository;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(username -> clientRepository.findByUsername(username));

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
    }
}
