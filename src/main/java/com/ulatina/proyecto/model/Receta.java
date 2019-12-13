/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.proyecto.model;

import java.sql.Date;

/**
 *
 * @author josepabloramirez
 */
public class Receta {

    private Integer idReceta;

    private Date fechaReceta;

    private Integer cantidad;

    private Integer idFarmaco;

    private Integer idPresentacion;

    private Integer idDoctor;

    private String medicamento;

    private String presentacionFarmaco;

    private String nombreDoctor;

    public Receta() {

    }

    public Receta(Date fechaReceta, Integer cantidad, Integer idFarmaco, Integer idPresentacion, Integer idDoctor) {
        this.fechaReceta = fechaReceta;
        this.cantidad = cantidad;
        this.idFarmaco = idFarmaco;
        this.idPresentacion = idPresentacion;
        this.idDoctor = idDoctor;
    }

    public Integer getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(Integer idReceta) {
        this.idReceta = idReceta;
    }

    public Date getFechaReceta() {
        return fechaReceta;
    }

    public void setFechaReceta(Date fechaReceta) {
        this.fechaReceta = fechaReceta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
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

    public Integer getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Integer idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getPresentacionFarmaco() {
        return presentacionFarmaco;
    }

    public void setPresentacionFarmaco(String presentacionFarmaco) {
        this.presentacionFarmaco = presentacionFarmaco;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

}
