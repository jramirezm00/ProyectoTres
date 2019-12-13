/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.proyecto.model;

/**
 *
 * @author josepabloramirez
 */
public class FarmacoPresentacion {

    private Integer idFarmaco;

    private Integer idPresentacion;

    private Integer precio;

    private String nombreComercial;

    private String nombrePresentacion;

    public FarmacoPresentacion() {

    }

    public FarmacoPresentacion(Integer idFarmaco, Integer idPresentacion, Integer precio) {
        this.idFarmaco = idFarmaco;
        this.idPresentacion = idPresentacion;
        this.precio = precio;
    }

    public Integer getIdFarmaco() {
        return idFarmaco;
    }

    public void setIdFarmaco(Integer idFarmaco) {
        this.idFarmaco = idFarmaco;
    }

    public Integer getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(Integer idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getNombrePresentacion() {
        return nombrePresentacion;
    }

    public void setNombrePresentacion(String nombrePresentacion) {
        this.nombrePresentacion = nombrePresentacion;
    }

}
