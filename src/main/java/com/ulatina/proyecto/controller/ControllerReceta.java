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
import java.io.Serializable;
import java.sql.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

/**
 *
 * @author kenneth
 */
@ManagedBean(name = "controllerReceta")
@SessionScoped
public class ControllerReceta implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Receta> recetas = new ArrayList<Receta>();

    private Farmaco farmacoSeleccionado;

    private String fechaReceta;

    private Integer cantidad;

    private Presentacion presentacionSeleccionada;

    private Usuario doctorSeleccionado;

    private Integer idReceta;

    public ControllerReceta() {

    }

    @PostConstruct
    public void init() {
        listar();
    }

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.recetas = usu.listarRecetas();
    }

    public void agregar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearReceta(this.farmacoSeleccionado.getIdFarmaco(), this.fechaReceta, this.cantidad, this.presentacionSeleccionada.getIdPresentacion(), this.doctorSeleccionado.getId());
    }

    public void editar() {
        System.out.println("me llamaron");
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarReceta(this.idReceta, this.cantidad);
    }

    public String redireccionarModificar(Integer idReceta) {
        this.idReceta = idReceta;
        return "recipesModify?faces-redirect=true&idReceta= " + this.idReceta;
    }

    public List<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(List<Receta> recetas) {
        this.recetas = recetas;
    }

    public Farmaco getFarmacoSeleccionado() {
        return farmacoSeleccionado;
    }

    public void setFarmacoSeleccionado(Farmaco farmacoSeleccionado) {
        this.farmacoSeleccionado = farmacoSeleccionado;
    }

    public String getFechaReceta() {
        return fechaReceta;
    }

    public void setFechaReceta(String fechaReceta) {
        this.fechaReceta = fechaReceta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Presentacion getPresentacionSeleccionada() {
        return presentacionSeleccionada;
    }

    public void setPresentacionSeleccionada(Presentacion presentacionSeleccionada) {
        this.presentacionSeleccionada = presentacionSeleccionada;
    }

    public Usuario getDoctorSeleccionado() {
        return doctorSeleccionado;
    }

    public void setDoctorSeleccionado(Usuario doctorSeleccionado) {
        this.doctorSeleccionado = doctorSeleccionado;
    }

    public Integer getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(Integer idReceta) {
        this.idReceta = idReceta;
    }

}
