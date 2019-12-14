/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.proyecto.controller;

import com.ulatina.proyecto.model.Ingreso;
import com.ulatina.proyecto.model.Paciente;
import com.ulatina.proyecto.model.Servicio;
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
@ManagedBean(name = "controllerIngreso")
@SessionScoped
public class ControllerIngreso {

    private static final long serialVersionUID = 1L;

    private List<Ingreso> ingresos = new ArrayList<>();
    private Paciente idPaciente;
    private Servicio idServicio;
    private Date fechaIngreso;
    private Date fechaSalida;
    private int idIngreso;

    public ControllerIngreso() {
    }

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.ingresos = usu.listarIngresos();
    }

    public void agregar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearIngreso(this.idPaciente.getIdPaciente(), this.idServicio.getIdServicio(), this.fechaIngreso, this.fechaSalida);
    }

    public void editar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarIngreso(this.idIngreso, this.fechaSalida);
    }

    public List<Ingreso> getIngresos() {
        return ingresos;
    }

    public void setIngresos(List<Ingreso> ingresos) {
        this.ingresos = ingresos;
    }

    public Paciente getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Paciente idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Servicio getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Servicio idServicio) {
        this.idServicio = idServicio;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }

}
