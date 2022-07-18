package com.rapidos.api_rapidoscar.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SingupModel {
    private int id;
    private String nom;
    private String prenom;
    private int telephone;
    private String email;
    private int numcni;
    private String username;
    private Set<String> role;
    private String password;
}
