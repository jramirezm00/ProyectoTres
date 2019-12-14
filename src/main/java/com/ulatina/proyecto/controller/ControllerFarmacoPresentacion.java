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

    private static final long serialVersionUID = 1L;

    private List<FarmacoPresentacion> farmacosPresentaciones = new ArrayList<>();
    private Farmaco idFarmaco;
    private Presentacion idPresentacion;
    private int monto;
    private int idFarmacoPresentacion;

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.farmacosPresentaciones = usu.listarFarmacoPresentacion();
    }

    public void agregar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearFarmacoPresentacion(this.idFarmaco.getIdFarmaco(), this.idPresentacion.getIdPresentacion(), this.monto);
    }

    public void editar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarFarmacoPresentacion(this.idFarmaco.getIdFarmaco(), this.idFarmacoPresentacion, this.monto);
    }

    public void eliminar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.eliminarFarmacoPresentacion(this.idFarmaco.getIdFarmaco(), this.idPresentacion.getIdPresentacion());
    }

    public List<FarmacoPresentacion> getFarmacosPresentaciones() {
        return farmacosPresentaciones;
    }

    public void setFarmacosPresentaciones(List<FarmacoPresentacion> farmacosPresentaciones) {
        this.farmacosPresentaciones = farmacosPresentaciones;
    }

    public Farmaco getIdFarmaco() {
        return idFarmaco;
    }

    public void setIdFarmaco(Farmaco idFarmaco) {
        this.idFarmaco = idFarmaco;
    }

    public Presentacion getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(Presentacion idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getId() {
        return idFarmacoPresentacion;
    }

    public void setId(int idFarmacoPresentacion) {
        this.idFarmacoPresentacion = idFarmacoPresentacion;
    }

}
