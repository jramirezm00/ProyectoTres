/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.proyecto.controller;

import com.ulatina.proyecto.model.Ingreso;
import com.ulatina.proyecto.model.Revision;
import com.ulatina.proyecto.model.Usuario;
import com.ulatina.proyecto.service.ControlProcAlmac;
import java.io.Serializable;
import java.sql.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author kenneth
 */
@ManagedBean(name = "controllerRevision")
@SessionScoped
public class ControllerRevision implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Revision> revisiones = new ArrayList<Revision>();

    private Integer idRevision;

    private Ingreso ingresoSeleccionado;

    private Usuario doctorSeleccionado;

    private String fechaRevision;

    private String informe;

    public ControllerRevision() {

    }

    @PostConstruct
    public void init() {
        listar();
    }

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.revisiones = usu.listarRevisiones();
    }

    public String agregar() {
        if(doctorSeleccionado.getIdUsuario() == null || ingresoSeleccionado.getIdIngreso() == null || fechaRevision == null ||
            informe == null){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Error!",  "Please enter all required spaces."));
            return null;
        }else{
            ControlProcAlmac usu = new ControlProcAlmac();
            usu.crearRevision(this.doctorSeleccionado.getIdUsuario(), this.ingresoSeleccionado.getIdIngreso(), this.fechaRevision, this.informe);
            return "revisions?faces-redirect=true";
        }
    }

    public void editar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarRevision(this.idRevision, this.informe);
    }

    public String redireccionarModificar(Integer idRevision) {
        this.idRevision = idRevision;
        return "revisionsModify?faces-redirect=true&idRevision= " + this.idRevision;
    }

    public List<Revision> getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(List<Revision> revisiones) {
        this.revisiones = revisiones;
    }

    public Integer getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(Integer idRevision) {
        this.idRevision = idRevision;
    }

    public Ingreso getIngresoSeleccionado() {
        return ingresoSeleccionado;
    }

    public void setIngresoSeleccionado(Ingreso ingresoSeleccionado) {
        this.ingresoSeleccionado = ingresoSeleccionado;
    }

    public Usuario getDoctorSeleccionado() {
        return doctorSeleccionado;
    }

    public void setDoctorSeleccionado(Usuario doctorSeleccionado) {
        this.doctorSeleccionado = doctorSeleccionado;
    }

    public String getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(String fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }

}
