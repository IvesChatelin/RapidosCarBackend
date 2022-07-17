package com.rapidos.api_rapidoscar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "agence")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agence implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idagence", nullable = false)
    private Integer id;

    @Column(name = "nomagence", length = 50)
    private String nomagence;

    @Column(name = "adresse", length = 50)
    private String adresse;

    @Column(name = "telephone")
    private Integer telephone;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "login", length = 20)
    private String login;

    @Column(name = "pwd", length = 80)
    private String pwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomagence() {
        return nomagence;
    }

    public void setNomagence(String nomagence) {
        this.nomagence = nomagence;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}