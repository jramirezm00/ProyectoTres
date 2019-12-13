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
public class Revision {

    private Integer id;

    private Integer idDoctor;

    private String nombreDoctor;

    private Integer idIngreso;

    private String nombrePaciente;

    private Date fechaRevision;

    private String informe;

    public Revision() {

    }

    public Revision(Integer id, Integer idDoctor, String nombreDoctor, Integer idIngreso, String nombrePaciente, Date fechaRevision, String informe) {
        this.id = id;
        this.idDoctor = idDoctor;
        this.nombreDoctor = nombreDoctor;
        this.idIngreso = idIngreso;
        this.nombrePaciente = nombrePaciente;
        this.fechaRevision = fechaRevision;
        this.informe = informe;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(Date fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }

    public Integer getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Integer idDoctor) {
        this.idDoctor = idDoctor;
    }

    public Integer getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(Integer idIngreso) {
        this.idIngreso = idIngreso;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

}
