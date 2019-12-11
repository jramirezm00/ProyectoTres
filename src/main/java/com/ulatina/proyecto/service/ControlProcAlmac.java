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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kenne
 */
public class ControlProcAlmac implements Serializable {

    private static final long serialVersionUID = 1L;
    private final Conector conectorJDBC = Conector.getConector();

    private final static String SP_LISTAR_USUARIO = "{ CALL ProyectoTresDemo.listar_usuario() }";
    private final static String SP_CREAR_USUARIO = "{CALL ProyectoTresDemo.crear_usuario()}";
    private final static String SP_EDITAR_USUARIO = "{CALL ProyectoTresDemo.editar_usuario()}";
    private final static String SP_ELIMINAR_USUARIO = "{CALL ProyectoTresDemo.eliminar_usuario()}";

    public List<Usuario> listarUsuarios(){
        Connection conn = conectorJDBC.conectar();
        CallableStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<Usuario>();
        Usuario usuario = null;
        try {
            stmt = conn.prepareCall(SP_LISTAR_USUARIO);
            stmt.execute();
            rs = (ResultSet) stmt.getResultSet();
            while (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setContrasena(rs.getString("contrasena"));
                usuario.setDireccion(rs.getString("direccion"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setTipo(rs.getString("tipo"));
                usuario.setId(rs.getInt("idServicio"));
                usuario.setNombreServicio(rs.getString("SERVICIO"));
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conectorJDBC.cerrarConexion(conn, stmt, rs);
        }
        return usuarios;
    }

}
