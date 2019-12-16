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
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author kenneth
 */
@ManagedBean(name = "controllerDetalleIngresoRevisionReceta")
@SessionScoped
public class ControllerDetalleIngresoRevisionReceta implements Serializable {

    private static final long serialVersionUID = 1L;

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

    public String agregar() {
        if(idIngreso.getIdIngreso() == null || idRevision.getIdRevision() == null || idReceta.getIdReceta() == null){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Error!",  "Please enter all required spaces."));
            return null;
        }else{
            ControlProcAlmac usu = new ControlProcAlmac();
            usu.crearRevisionReceta(this.idIngreso.getIdIngreso(), this.idRevision.getIdRevision(), this.idReceta.getIdReceta());
            return "userProfile.xhtml?faces-redirect=true";
        }
    }

    public List<DetalleIngresosRevisionReceta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleIngresosRevisionReceta> detalles) {
        this.detalles = detalles;
    }

    public Ingreso getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(Ingreso idIngreso) {
        this.idIngreso = idIngreso;
    }

    public Revision getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(Revision idRevision) {
        this.idRevision = idRevision;
    }

    public Receta getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(Receta idReceta) {
        this.idReceta = idReceta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
