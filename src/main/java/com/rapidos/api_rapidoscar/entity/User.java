package com.rapidos.api_rapidoscar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @Column(name = "iduser", nullable = false)
    private Integer id;

    @Column(name = "nom", length = 50)
    private String nom;

    @Column(name = "prenom", length = 50)
    private String prenom;

    @Column(name = "email", length = 54)
    private String email;

    @Column(name = "telephone")
    private Integer telephone;

    @Column(name = "password", length = 80)
    private String password;

    @Column(name = "numcni")
    private Integer numcni;

    @Column(name = "username", length = 50)
    private String username;

    @Column(name = "role", length = 50)
    private String role;

}