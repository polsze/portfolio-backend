package com.portfolio.polsze.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreSki;
    private String valorSki;

    public Skills() {
    }

    public Skills(String nombreSki, String valorSki) {
        this.nombreSki = nombreSki;
        this.valorSki = valorSki;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreSki() {
        return nombreSki;
    }

    public void setNombreSki(String nombreSki) {
        this.nombreSki = nombreSki;
    }

    public String getValorSki() {
        return valorSki;
    }

    public void setValorSki(String valorSki) {
        this.valorSki = valorSki;
    }

}
