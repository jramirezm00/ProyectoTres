/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.proyecto.controller;

import com.ulatina.proyecto.model.DetalleIngresosRevisionReceta;
import com.ulatina.proyecto.model.Ingreso;
import com.ulatina.proyecto.model.Receta;
import com.ulatina.proyecto.model.Revision;
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
@ManagedBean(name = "controllerDetalleIngresoRevisionReceta")
@SessionScoped
public class ControllerDetalleIngresoRevisionReceta {

    private List<DetalleIngresosRevisionReceta> detalles = new ArrayList<>();
    private Ingreso idIngreso;
    private Revision idRevision;
    private Receta idReceta;
    private int id;

    public ControllerDetalleIngresoRevisionReceta() {
    }
       public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.detalles = usu.listarDetalleIngresosRevisionRecetas();
    }

    public void agregar(Ingreso idIngreso, Revision idRevision, Receta idReceta) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearRevisionReceta(idIngreso.getIdIngreso(), idRevision.getId(), idReceta.getIdReceta());
    }
}
