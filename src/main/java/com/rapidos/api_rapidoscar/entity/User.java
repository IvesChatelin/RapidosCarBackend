package com.rapidos.api_rapidoscar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"username", "email"})
})
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

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "role",
    joinColumns = @JoinColumn(name = "iduser"),
    inverseJoinColumns = @JoinColumn(name = "idrole"))
    private  Set<Role> roles = new HashSet<>();

}