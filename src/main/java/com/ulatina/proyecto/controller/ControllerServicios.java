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

    private List<Servicio> servicios = new ArrayList<>();
    private String nombre;
    private int id;

    public ControllerServicios() {
    }

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.servicios = usu.listarServicios();
    }
    public void agregar(String nombre) {
         ControlProcAlmac usu = new ControlProcAlmac();
         usu.crearServicio(nombre);
    }
    public void editar(Integer id , String descripcion){
         ControlProcAlmac usu = new ControlProcAlmac();
         usu.editarServicio(id, descripcion);
    }
    public void eliminar(Integer id){
         ControlProcAlmac usu = new ControlProcAlmac();
         usu.eliminarServicio(id);
    }
}
