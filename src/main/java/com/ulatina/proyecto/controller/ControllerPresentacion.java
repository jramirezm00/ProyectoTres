/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.proyecto.controller;

import com.ulatina.proyecto.model.Presentacion;
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
@ManagedBean(name = "controllerPresentacion")
@SessionScoped
public class ControllerPresentacion {

    private List<Presentacion> presentaciones = new ArrayList<>();
    private String nombrePresentacion;
    private int id;

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.presentaciones = usu.listarPresentacion();
    }

    public void agregar(String nombrePresentacion) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearPresentacion(nombrePresentacion);
    }

    public void editar(Integer id, String descripcion) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarPresentacion(id, descripcion);
    }

    public void eliminar(Integer id) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.eliminarPresentacion(id);
    }

}
