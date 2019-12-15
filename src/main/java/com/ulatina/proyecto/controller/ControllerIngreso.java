/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.proyecto.controller;

import com.ulatina.proyecto.model.Ingreso;
import com.ulatina.proyecto.model.Paciente;
import com.ulatina.proyecto.model.Servicio;
import com.ulatina.proyecto.model.Usuario;
import com.ulatina.proyecto.service.ControlProcAlmac;
import java.io.Serializable;
import java.sql.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

/**
 *
 * @author kenneth
 */
@ManagedBean(name = "controllerIngreso")
@SessionScoped
public class ControllerIngreso implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Ingreso> ingresos = new ArrayList<>();

    private Paciente pacienteSeleccionado;

    private Servicio servicioSeleccionado;

    private Usuario doctorSeleccionado;

    private String fechaIngreso;

    private String fechaSalida;

    private Integer idIngreso;

    public ControllerIngreso() {

    }

    @PostConstruct
    public void init() {
        listar();
    }

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.ingresos = usu.listarIngresos();
    }

    public void agregar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        System.out.println("ME ESTAN LLAMANDO!!!");
        System.out.println(this.pacienteSeleccionado.getNombre());
        System.out.println(this.servicioSeleccionado.getDescripcion());
        usu.crearIngreso(this.pacienteSeleccionado.getIdPaciente(), this.servicioSeleccionado.getIdServicio(), this.fechaIngreso);
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

    public Paciente getPacienteSeleccionado() {
        return pacienteSeleccionado;
    }

    public void setPacienteSeleccionado(Paciente pacienteSeleccionado) {
        this.pacienteSeleccionado = pacienteSeleccionado;
    }

    public Servicio getServicioSeleccionado() {
        return servicioSeleccionado;
    }

    public void setServicioSeleccionado(Servicio servicioSeleccionado) {
        this.servicioSeleccionado = servicioSeleccionado;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Integer getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(Integer idIngreso) {
        this.idIngreso = idIngreso;
    }

    public Usuario getDoctorSeleccionado() {
        return doctorSeleccionado;
    }

    public void setDoctorSeleccionado(Usuario doctorSeleccionado) {
        this.doctorSeleccionado = doctorSeleccionado;
    }

}
