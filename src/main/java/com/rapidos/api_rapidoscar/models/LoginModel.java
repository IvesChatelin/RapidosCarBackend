package com.rapidos.api_rapidoscar.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginModel {
    private String UserName;
    private String password;
}
