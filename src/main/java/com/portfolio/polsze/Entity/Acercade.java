
package com.portfolio.polsze.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Acercade {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    
    private int id;
    private String nombreAc;
    private String apellidoAc;
    private String descripcionAc;
    private String imgAc;

    public Acercade() {
    }

    public Acercade(String nombreAc, String apellidoAc, String descripcionAc, String imgAc) {
        this.nombreAc = nombreAc;
        this.apellidoAc = apellidoAc;
        this.descripcionAc = descripcionAc;
        this.imgAc = imgAc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
