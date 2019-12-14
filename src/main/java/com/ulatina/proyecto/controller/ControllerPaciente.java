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

    private List<Paciente> pacientes = new ArrayList<>();
    private String nombre;
    private int idSeguroSocial;
    private String direccion;
    private String telefono;
    private Date fechaNacimiento;

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.pacientes = usu.listarPaciente();
    }

    public void agregar(String nombre, Integer idSeguroSocial, String direccion, String telefono, Date fechaDeNacimiento) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearPaciente(nombre, idSeguroSocial, direccion, telefono, fechaNacimiento);
    }

    public void editar(Integer id, String nombre, Integer idSeguroSocial, String direccion, String telefono) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarPaciente(id, nombre, idSeguroSocial, direccion, telefono);
    }
}
