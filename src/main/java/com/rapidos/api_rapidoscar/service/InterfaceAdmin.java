package com.rapidos.api_rapidoscar.service;

import com.rapidos.api_rapidoscar.entity.Admin;

import java.util.List;

public interface InterfaceAdmin {

    Admin save(Admin admin);

    Admin update(Admin admin, Integer id);

    void delete(Integer id);

    List<Admin> getAll();
}
