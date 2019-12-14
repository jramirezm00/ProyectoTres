/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.proyecto.controller;

import com.ulatina.proyecto.model.Ingreso;
import com.ulatina.proyecto.model.Receta;
import com.ulatina.proyecto.model.Revision;
import com.ulatina.proyecto.model.Usuario;
import com.ulatina.proyecto.service.ControlProcAlmac;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Date;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kenneth
 */
@ManagedBean(name = "controllerRevision")
@SessionScoped
public class ControllerRevision {

    private static final long serialVersionUID = 1L;

    private List<Revision> revisiones = new ArrayList<>();
    private int id;
    private Ingreso idIngreso;
    private Receta idReceta;
    private Usuario idDoctor;
    private Date fechaRevision;
    private String informe;

    public ControllerRevision() {
    }

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.revisiones = usu.listarRevisiones();
    }

    public void agregar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearRevision(this.idDoctor.getId(), this.idIngreso.getIdIngreso(), this.fechaRevision, this.informe);
    }

    public void editar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarRevision(this.id, this.informe);
    }

    public List<Revision> getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(List<Revision> revisiones) {
        this.revisiones = revisiones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ingreso getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(Ingreso idIngreso) {
        this.idIngreso = idIngreso;
    }

    public Receta getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(Receta idReceta) {
        this.idReceta = idReceta;
    }

    public Usuario getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Usuario idDoctor) {
        this.idDoctor = idDoctor;
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

}
