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

    private List<Receta> recetas = new ArrayList<>();
    private Farmaco idFarmaco;
    private Date fechaReceta;
    private int cantidad;
    private Presentacion idPresentacion;
    private Usuario idDoctor;

    public ControllerReceta() {

    }

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.recetas = usu.listarRecetas();
    }

    public void agregar(Farmaco idFarmaco, Date fechReceta, Integer cantidad, Presentacion idPresentacion, Usuario idDoctor) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearReceta(idFarmaco.getIdFarmaco(), fechReceta, cantidad, idPresentacion.getIdPresentacion(), idDoctor.getId());
    }

    public void editar(Integer id, Integer cantidad) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarReceta(id, cantidad);
    }

}
