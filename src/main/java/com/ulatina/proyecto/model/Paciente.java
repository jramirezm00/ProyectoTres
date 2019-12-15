/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.proyecto.model;

import java.sql.Date;

/**
 *
 * @author josepabloramirez
 */
public class Paciente {

    private Integer idPaciente;

    private String nombre;

    private Integer idSeguroSocial;

    private String direccion;

    private Integer telefono;

    private String fechaNacimiento;

    public Paciente() {

    }

    public Paciente(Integer idPaciente, String nombre, Integer idSeguroSocial, String direccion, Integer telefono, String fechaNacimiento) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.idSeguroSocial = idSeguroSocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdSeguroSocial() {
        return idSeguroSocial;
    }

    public void setIdSeguroSocial(Integer idSeguroSocial) {
        this.idSeguroSocial = idSeguroSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
