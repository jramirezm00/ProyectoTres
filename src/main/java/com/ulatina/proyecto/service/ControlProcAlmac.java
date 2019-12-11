/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina.proyecto.service;

import com.ulatina.proyecto.model.Usuario;
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 *
 * @author kenne
 */
public class ControlProcAlmac implements Serializable {

    private static final long serialVersionUID = 1L;
    private final Conector conectorJDBC = Conector.getConector();

    private final static String SP_LISTAR_USUARIO = "{CALL proyectotresdemo.listar_usuario()}";
    private final static String SP_CREAR_USUARIO = "{CALL proyectotresdemo.crear_usuario()}";
    private final static String SP_EDITAR_USUARIO = "{CALL proyectotresdemo.editar_usuario()}";
    private final static String SP_ELIMINAR_USUARIO = "{CALL proyectotresdemo.eliminar_usuario()}";

    public Usuario listar() throws SQLException, ClassNotFoundException {
        Connection conn = conectorJDBC.conectar();

        CallableStatement stmt = null;
        ResultSet rs = null;
        Usuario listarUs = null;
        try {
            stmt = conn.prepareCall(SP_LISTAR_USUARIO);
            rs = (ResultSet) stmt.getResultSet();
            while (rs.next()) {
                listarUs = new Usuario();
                listarUs.setId(rs.getInt("id"));
                listarUs.setNombre(rs.getString("nombre"));
                listarUs.setCorreo(rs.getString("correo"));
                listarUs.setContrasena(rs.getString("contrasena"));
                listarUs.setTelefono(rs.getString("telefono"));
                listarUs.setTipo(rs.getString("tipo"));
                listarUs.setId(rs.getInt("idServicio"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error, no se pudo completar la conexion a la Base de Datos");
        } finally {
            conectorJDBC.cerrarConexion(conn, stmt, rs);
        }
        return listarUs;
    }

}
