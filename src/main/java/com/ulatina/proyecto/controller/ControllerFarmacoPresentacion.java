/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.proyecto.controller;

import com.ulatina.proyecto.model.Farmaco;
import com.ulatina.proyecto.model.FarmacoPresentacion;
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
@ManagedBean(name = "controllerFarmacoPresentacion")
@SessionScoped
public class ControllerFarmacoPresentacion {
     private List<FarmacoPresentacion> farmacosPresentaciones = new ArrayList<>();
     private Farmaco idFarmaco;
     private Presentacion idPresentacion;
     private int monto;
     private int id;
     
     public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.farmacosPresentaciones = usu.listarFarmacoPresentacion();
    }

    public void agregar(Farmaco idFarmaco, Presentacion idPresentacion, Integer precio) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearFarmacoPresentacion(idFarmaco.getIdFarmaco(), idPresentacion.getIdPresentacion(), precio);
    }

    public void editar(Farmaco idRegistro, Integer id, Integer monto) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarFarmacoPresentacion(idRegistro.getIdFarmaco(), id, monto);
    }
    public void eliminar(Farmaco idMedicamento, Presentacion idPresentacion){
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.eliminarFarmacoPresentacion(idMedicamento.getIdFarmaco(), idPresentacion.getIdPresentacion());
    }
}
