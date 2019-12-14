/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.proyecto.controller;

import com.ulatina.proyecto.model.Farmaco;
import com.ulatina.proyecto.model.Presentacion;
import com.ulatina.proyecto.model.Receta;
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
@ManagedBean(name = "controllerReceta")
@SessionScoped
public class ControllerReceta {

    private static final long serialVersionUID = 1L;

    private List<Receta> recetas = new ArrayList<>();
    private Farmaco idFarmaco;
    private Date fechaReceta;
    private int cantidad;
    private Presentacion idPresentacion;
    private Usuario idDoctor;
    private int idReceta;

    public ControllerReceta() {

    }

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.recetas = usu.listarRecetas();
    }

    public void agregar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearReceta(this.idFarmaco.getIdFarmaco(), this.fechaReceta, this.cantidad, this.idPresentacion.getIdPresentacion(), this.idDoctor.getId());
    }

    public void editar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarReceta(this.idReceta, this.cantidad);
    }

    public List<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(List<Receta> recetas) {
        this.recetas = recetas;
    }

    public Farmaco getIdFarmaco() {
        return idFarmaco;
    }

    public void setIdFarmaco(Farmaco idFarmaco) {
        this.idFarmaco = idFarmaco;
    }

    public Date getFechaReceta() {
        return fechaReceta;
    }

    public void setFechaReceta(Date fechaReceta) {
        this.fechaReceta = fechaReceta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Presentacion getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(Presentacion idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

    public Usuario getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Usuario idDoctor) {
        this.idDoctor = idDoctor;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

}
