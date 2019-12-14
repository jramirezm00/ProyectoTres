/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.proyecto.controller;

import com.ulatina.proyecto.model.Paciente;
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
@ManagedBean(name = "controllerPaciente")
@SessionScoped
public class ControllerPaciente {

    private static final long serialVersionUID = 1L;

    private List<Paciente> pacientes = new ArrayList<>();
    private String nombre;
    private int idSeguroSocial;
    private String direccion;
    private String telefono;
    private Date fechaNacimiento;
    private int idPaciente;

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.pacientes = usu.listarPaciente();
    }

    public void agregar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearPaciente(this.nombre, this.idSeguroSocial, this.direccion, this.telefono, this.fechaNacimiento);
    }

    public void editar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarPaciente(this.idPaciente, this.nombre, this.idSeguroSocial, this.direccion, this.telefono);
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdSeguroSocial() {
        return idSeguroSocial;
    }

    public void setIdSeguroSocial(int idSeguroSocial) {
        this.idSeguroSocial = idSeguroSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

}
