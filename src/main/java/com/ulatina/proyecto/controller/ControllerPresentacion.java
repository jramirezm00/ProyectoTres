/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.proyecto.controller;

import com.ulatina.proyecto.model.Presentacion;
import com.ulatina.proyecto.service.ControlProcAlmac;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

/**
 *
 * @author kenneth
 */
@ManagedBean(name = "controllerPresentacion")
@SessionScoped
public class ControllerPresentacion implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Presentacion> presentaciones = new ArrayList<Presentacion>();

    private String nombrePresentacion;

    private Integer idPresentacion;

    public ControllerPresentacion() {

    }

    @PostConstruct
    public void init() {
        listar();
    }

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.presentaciones = usu.listarPresentacion();
    }

    public void agregar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearPresentacion(this.nombrePresentacion);
    }

    public void editar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarPresentacion(this.idPresentacion, this.nombrePresentacion);
    }

    public void eliminar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.eliminarPresentacion(this.idPresentacion);
    }

    public List<Presentacion> getPresentaciones() {
        return presentaciones;
    }

    public void setPresentaciones(List<Presentacion> presentaciones) {
        this.presentaciones = presentaciones;
    }

    public String getNombrePresentacion() {
        return nombrePresentacion;
    }

    public void setNombrePresentacion(String nombrePresentacion) {
        this.nombrePresentacion = nombrePresentacion;
    }

    public Integer getId() {
        return idPresentacion;
    }

    public void setId(Integer idPresentacion) {
        this.idPresentacion = idPresentacion;
    }
}
