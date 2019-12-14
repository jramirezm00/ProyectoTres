/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.proyecto.controller;

import com.ulatina.proyecto.service.ControlProcAlmac;
import com.ulatina.proyecto.model.Usuario;
import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author kenneth
 */
@ManagedBean(name = "controllerUsuario")
@SessionScoped
public class ControllerUsuario implements Serializable {

    private static final long serialVersionUID = 1L;

    private String usuario;
    private String Contrasena;
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Usuario> usuarios = new ArrayList<>();

    public ControllerUsuario() {
    }

    public void listar() {
        ControlProcAlmac usu = new ControlProcAlmac();
        this.usuarios = usu.listarUsuarios();
    }

    public void eliminarUsuario(int id) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.eliminarUsuario(id);
    }

    public void editar_usuario(Integer id, String nombre, String direccion, String telefono) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.editarUsuario(id, nombre, direccion, telefono);
    }

    public void crear_usuario(String nombre, String correo, String contra, String direccion, String telefono, String tipoUsurio, Integer idServicio) {
        ControlProcAlmac usu = new ControlProcAlmac();
        usu.crearUsuario(nombre, correo, contra, direccion, telefono, tipoUsurio, idServicio);
    }

   
    private boolean login(String usuario, String contra) throws SQLException, ClassNotFoundException {
        FacesMessage msg;
        ControlProcAlmac usu = new ControlProcAlmac();
        Usuario userLogin = usu.login(usuario, contra);
        if (userLogin != null) {
            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", userLogin.getNombre());
            this.redirect("landingPage.xhtml");
            return true;
        }
        else{
            msg = new FacesMessage("Datos incorrectos,volver a ingresar los datos");
        }
        return false;
    }

    public void logout() {
        try {
            FacesContext.getCurrentInstance().getExternalContext()
                    .invalidateSession();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void redirect(String url) {
        try {
            HttpServletRequest request = (HttpServletRequest) FacesContext
                    .getCurrentInstance().getExternalContext().getRequest();
            FacesContext
                    .getCurrentInstance()
                    .getExternalContext()
                    .redirect(
                            request.getContextPath()
                            + "/faces/" + url);
        } catch (IOException e) {
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

}
