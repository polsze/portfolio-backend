package com.portfolio.polsze.Dto;

import javax.validation.constraints.NotBlank;

public class DtoEducacion {

    @NotBlank
    private String nombreEdu;
    private String descripcionEdu;
    private String fechaEdu;
    private String linkEdu;

    public DtoEducacion() {
    }

    public DtoEducacion(String nombreEdu, String descripcionEdu, String fechaEdu, String linkEdu) {
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
        this.linkEdu = linkEdu;
    }

    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getFechaEdu() {
        return fechaEdu;
    }

    public void setFechaEdu(String fechaEdu) {
        this.fechaEdu = fechaEdu;
    }

    public String getLinkEdu() {
        return linkEdu;
    }

    public void setLinkEdu(String linkEdu) {
        this.linkEdu = linkEdu;
    }

}
