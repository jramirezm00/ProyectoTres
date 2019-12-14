/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.proyecto.controller;

import com.ulatina.proyecto.model.Servicio;
import com.ulatina.proyecto.service.ControlProcAlmac;
import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kenneth
 */
@ManagedBean(name = "controllerServicios")
@SessionScoped
public class ControllerServicios {

    private static final long serialVersionUID = 1L;

    private List<Servicio> servicios = new ArrayList<>();
    private String nombre;
    private int id;

    public ControllerServicios() {
    }

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.servicios = usu.listarServicios();
    }

    public void agregar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearServicio(this.nombre);
    }

    public void editar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarServicio(this.id, this.nombre);
    }

    public void eliminar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.eliminarServicio(this.id);
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
