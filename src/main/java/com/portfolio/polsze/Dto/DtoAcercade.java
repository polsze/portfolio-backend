
package com.portfolio.polsze.Dto;

import javax.validation.constraints.NotBlank;


public class DtoAcercade {
    @NotBlank
    private String nombreAc;
    private String apellidoAc;
    private String descripcionAc;
    private String imgAc;

    public DtoAcercade() {
    }

    public DtoAcercade(String nombreAc, String apellidoAc, String descripcionAc, String imgAc) {
        this.nombreAc = nombreAc;
        this.apellidoAc = apellidoAc;
        this.descripcionAc = descripcionAc;
        this.imgAc = imgAc;
    }

    public String getNombreAc() {
        return nombreAc;
    }

    public void setNombreAc(String nombreAc) {
        this.nombreAc = nombreAc;
    }

    public String getApellidoAc() {
        return apellidoAc;
    }

    public void setApellidoAc(String apellidoAc) {
        this.apellidoAc = apellidoAc;
    }

    public String getDescripcionAc() {
        return descripcionAc;
    }

    public void setDescripcionAc(String descripcionAc) {
        this.descripcionAc = descripcionAc;
    }

    public String getImgAc() {
        return imgAc;
    }

    public void setImgAc(String imgAc) {
        this.imgAc = imgAc;
    }
    
    
}
