package com.portfolio.polsze.Dto;

import javax.validation.constraints.NotBlank;

public class DtoSkills {

    @NotBlank
    private String nombreSki;
    private String valorSki;

    public DtoSkills() {
    }

    public DtoSkills(String nombreSki, String valorSki) {
        this.nombreSki = nombreSki;
        this.valorSki = valorSki;
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
