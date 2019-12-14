/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.proyecto.controller;

import com.ulatina.proyecto.model.Farmaco;
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
@ManagedBean(name = "controllerFarmaco")
@SessionScoped
public class ControllerFarmaco {

    private static final long serialVersionUID = 1L;

    private List<Farmaco> farmacos = new ArrayList<>();
    private String nombreComercial;
    private String nombreClinico;
    private String compuestoQuimico;
    private String ubicacion;
    private String codigoProveedor;
    private int idRegistro;

    public ControllerFarmaco() {
    }

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.farmacos = usu.listarFarmaco();
    }

    public void agregar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearFarmaco(this.nombreComercial, this.nombreClinico, this.compuestoQuimico, this.ubicacion, this.codigoProveedor);
    }

    public void editar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarFarmaco(this.idRegistro, this.nombreComercial, this.nombreClinico, this.compuestoQuimico, this.ubicacion, this.codigoProveedor);
    }

    public void eliminar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.eliminarFarmaco(this.idRegistro);
    }

    public List<Farmaco> getFarmacos() {
        return farmacos;
    }

    public void setFarmacos(List<Farmaco> farmacos) {
        this.farmacos = farmacos;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getNombreClinico() {
        return nombreClinico;
    }

    public void setNombreClinico(String nombreClinico) {
        this.nombreClinico = nombreClinico;
    }

    public String getCompuestoQuimico() {
        return compuestoQuimico;
    }

    public void setCompuestoQuimico(String compuestoQuimico) {
        this.compuestoQuimico = compuestoQuimico;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }
    
}
