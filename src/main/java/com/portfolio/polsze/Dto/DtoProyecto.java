package com.portfolio.polsze.Dto;

import javax.validation.constraints.NotBlank;

public class DtoProyecto {

    @NotBlank
    private String nombrePro;
    private String descripcionPro;
    private String linkPro;

    public DtoProyecto() {
    }

    public DtoProyecto(String nombrePro, String descripcionPro, String linkPro) {
        this.nombrePro = nombrePro;
        this.descripcionPro = descripcionPro;
        this.linkPro = linkPro;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getDescripcionPro() {
        return descripcionPro;
    }

    public void setDescripcionPro(String descripcionPro) {
        this.descripcionPro = descripcionPro;
    }

    public String getLinkPro() {
        return linkPro;
    }

    public void setLinkPro(String linkPro) {
        this.linkPro = linkPro;
    }

}
