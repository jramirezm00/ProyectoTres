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

    private Integer idFarmaco;

    private Integer idPresentacion;

    private String dscFarmaco;

    private String dscPresentacion;

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
        usu.editarFarmacoPresentacion(this.idFarmaco, this.idPresentacion, this.monto);
    }

    public void eliminar(Integer idFarmaco, Integer idPresentacion) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.eliminarFarmacoPresentacion(idFarmaco, idPresentacion);
    }

    public String redireccionarModificar(Integer idFarmaco, Integer idPresentacion, String farmaco, String presentacion) {
        this.idFarmaco = idFarmaco;
        this.idPresentacion = idPresentacion;
        this.dscFarmaco = farmaco;
        this.dscPresentacion = presentacion;
        return "drugsModify?faces-redirect=true&idFarmaco= " + this.idFarmaco + "&idPresentacion= " + this.idPresentacion;
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

    public Integer getIdFarmacoPresentacion() {
        return idFarmacoPresentacion;
    }

    public void setIdFarmacoPresentacion(Integer idFarmacoPresentacion) {
        this.idFarmacoPresentacion = idFarmacoPresentacion;
    }

    public Integer getIdFarmaco() {
        return idFarmaco;
    }

    public void setIdFarmaco(Integer idFarmaco) {
        this.idFarmaco = idFarmaco;
    }

    public Integer getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(Integer idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

    public String getDscFarmaco() {
        return dscFarmaco;
    }

    public void setDscFarmaco(String dscFarmaco) {
        this.dscFarmaco = dscFarmaco;
    }

    public String getDscPresentacion() {
        return dscPresentacion;
    }

    public void setDscPresentacion(String dscPresentacion) {
        this.dscPresentacion = dscPresentacion;
    }

}
