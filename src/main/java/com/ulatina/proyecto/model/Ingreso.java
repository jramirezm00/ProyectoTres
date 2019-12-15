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
public class Ingreso {

    private Integer idIngreso;

    private String fechaIngreso;

    private String fechaSalida;

    private Integer idPaciente;

    private Integer idServicio;

    private String nombrePaciente;

    private String nombreServicio;

    public Ingreso() {

    }

    public Ingreso(String fechaIngreso, String fechaSalida, Integer idPaciente, Integer idServicio) {
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.idPaciente = idPaciente;
        this.idServicio = idServicio;
    }

    public Integer getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngresos(Integer idIngreso) {
        this.idIngreso = idIngreso;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

}
