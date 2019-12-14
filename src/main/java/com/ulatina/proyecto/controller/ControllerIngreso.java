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

    private List<Ingreso> ingresos = new ArrayList<>();
    private Paciente idpaciente;
    private Servicio idServicio;
    private Date fechaIngreso;
    private Date fechaSalida;

    public ControllerIngreso() {
    }

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.ingresos = usu.listarIngresos();
    }

    public void agregar(Paciente idPaciente, Servicio idServicio, Date fechaIngreso, Date fechaSalida) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearIngreso(idPaciente.getIdPaciente(), idServicio.getIdServicio(), fechaIngreso, fechaSalida);
    }

    public void editar(Integer id, Date fechaSalida) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarIngreso(id, fechaSalida);
    }
}
