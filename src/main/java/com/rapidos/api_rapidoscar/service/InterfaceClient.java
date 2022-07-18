package com.rapidos.api_rapidoscar.service;


import com.rapidos.api_rapidoscar.entity.User;

import java.util.List;

public interface InterfaceClient {

    User save(User user);

    void delete(Integer id);

    User update(User user, Integer id);

    List<User> getAll();
}
