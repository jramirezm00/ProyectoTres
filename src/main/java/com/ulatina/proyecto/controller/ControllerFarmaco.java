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

    private List<Farmaco> farmacos = new ArrayList<>();
    private String nombreComercial;
    private String nombreClinico;
    private String compuestoQuimico;
    private String Ubicacion;
    private String codigoProveedor;
    private int id;

    public ControllerFarmaco() {
    }

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.farmacos = usu.listarFarmaco();
    }

    public void agregar(String nombreComercial, String nombreClinico, String compuestoQuimico, String ubicacion, String codigoProveedor) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearFarmaco(nombreComercial, nombreClinico, compuestoQuimico, ubicacion, codigoProveedor);
    }

    public void editar(Integer idRegistro, String nombreComercial, String nombreClinico, String compuestoQuimico, String ubicacion, String codigoProveedor) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarFarmaco(idRegistro, nombreComercial, nombreClinico, compuestoQuimico, ubicacion, codigoProveedor);
    }

    public void eliminar(Integer id) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.eliminarFarmaco(id);
    }
}
