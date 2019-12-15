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
@ManagedBean(name = "controllerFarmacoPresentacion")
@SessionScoped
public class ControllerFarmacoPresentacion implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<FarmacoPresentacion> farmacosPresentaciones = new ArrayList<>();

    private Farmaco farmacoSeleccionado;

    private Presentacion presentacionSeleccionada;

    private Integer monto;

    private Integer idFarmacoPresentacion;

    public ControllerFarmacoPresentacion() {

    }

    @PostConstruct
    public void init() {
        listar();
    }

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.farmacosPresentaciones = usu.listarFarmacoPresentacion();
    }

    public void agregar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearFarmacoPresentacion(this.farmacoSeleccionado.getIdFarmaco(), this.presentacionSeleccionada.getIdPresentacion(), this.monto);
    }

    public void editar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarFarmacoPresentacion(this.farmacoSeleccionado.getIdFarmaco(), this.idFarmacoPresentacion, this.monto);
    }

    public void eliminar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.eliminarFarmacoPresentacion(this.farmacoSeleccionado.getIdFarmaco(), this.presentacionSeleccionada.getIdPresentacion());
    }

    public List<FarmacoPresentacion> getFarmacosPresentaciones() {
        return farmacosPresentaciones;
    }

    public void setFarmacosPresentaciones(List<FarmacoPresentacion> farmacosPresentaciones) {
        this.farmacosPresentaciones = farmacosPresentaciones;
    }

    public Farmaco getFarmacoSeleccionado() {
        return farmacoSeleccionado;
    }

    public void setFarmacoSeleccionado(Farmaco farmacoSeleccionado) {
        this.farmacoSeleccionado = farmacoSeleccionado;
    }

    public Presentacion getPresentacionSeleccionada() {
        return presentacionSeleccionada;
    }

    public void setPresentacionSeleccionada(Presentacion presentacionSeleccionada) {
        this.presentacionSeleccionada = presentacionSeleccionada;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public Integer getId() {
        return idFarmacoPresentacion;
    }

    public void setId(Integer idFarmacoPresentacion) {
        this.idFarmacoPresentacion = idFarmacoPresentacion;
    }

}
