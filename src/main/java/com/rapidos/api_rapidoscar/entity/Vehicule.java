package com.rapidos.api_rapidoscar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "vehicule")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule implements Serializable {
    @Id
    @Column(name = "idvehicule", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idagence", nullable = false)
    private Agence idagence;

    @Column(name = "nomvehicule", length = 50)
    private String nomvehicule;

    @Column(name = "marque", length = 50)
    private String marque;

    @Column(name = "categorie", length = 50)
    private String categorie;

    @Column(name = "transmission", length = 50)
    private String transmission;

    @Column(name = "porte")
    private Integer porte;

    @Column(name = "siege")
    private Integer siege;

    @Column(name = "kilometrage", length = 50)
    private String kilometrage;

    @Column(name = "climatisation", length = 50)
    private String climatisation;

    @Column(name = "ageconducteur")
    private Integer ageconducteur;

    @Column(name = "prixjour")
    private Integer prixjour;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Agence getIdagence() {
        return idagence;
    }

    public void setIdagence(Agence idagence) {
        this.idagence = idagence;
    }

    public String getNomvehicule() {
        return nomvehicule;
    }

    public void setNomvehicule(String nomvehicule) {
        this.nomvehicule = nomvehicule;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Integer getPorte() {
        return porte;
    }

    public void setPorte(Integer porte) {
        this.porte = porte;
    }

    public Integer getSiege() {
        return siege;
    }

    public void setSiege(Integer siege) {
        this.siege = siege;
    }

    public String getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(String kilometrage) {
        this.kilometrage = kilometrage;
    }

    public String getClimatisation() {
        return climatisation;
    }

    public void setClimatisation(String climatisation) {
        this.climatisation = climatisation;
    }

    public Integer getAgeconducteur() {
        return ageconducteur;
    }

    public void setAgeconducteur(Integer ageconducteur) {
        this.ageconducteur = ageconducteur;
    }

    public Integer getPrixjour() {
        return prixjour;
    }

    public void setPrixjour(Integer prixjour) {
        this.prixjour = prixjour;
    }

}