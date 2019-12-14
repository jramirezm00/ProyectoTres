/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.proyecto.controller;

import com.ulatina.proyecto.model.Ingreso;
import com.ulatina.proyecto.model.Receta;
import com.ulatina.proyecto.model.Revision;
import com.ulatina.proyecto.model.Usuario;
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
@ManagedBean(name = "controllerRevision")
@SessionScoped
public class ControllerRevision {

    private List<Revision> revisiones = new ArrayList<>();
    private int id;
    private Ingreso idIngreso;
    private Receta idReceta;
    private Usuario doctor;
    private Date Revision;
    private String informe;

    public ControllerRevision() {
    }

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.revisiones = usu.listarRevisiones();
    }

    public void agregar(Usuario idDoctor, Ingreso idIngreso, Date fechaRevision, String informe) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearRevision(idDoctor.getId(), idIngreso.getIdIngreso(), fechaRevision, informe);
    }

    public void editar(Integer id, String informe) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarRevision(id, informe);
    }
}
