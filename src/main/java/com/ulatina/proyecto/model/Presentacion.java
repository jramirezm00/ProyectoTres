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
public class Presentacion {

    private Integer idPresentacion;

    private String descripcion;

    public Presentacion() {

    }

    public Presentacion(Integer idPresentacion, String descripcion) {
        this.idPresentacion = idPresentacion;
        this.descripcion = descripcion;
    }

    public Integer getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(Integer idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
