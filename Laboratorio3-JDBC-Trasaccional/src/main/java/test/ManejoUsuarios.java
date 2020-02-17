package test;

import datos.Conexiones;
import datos.UsuarioJDBC;
import domain.Usuario;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManejoUsuarios {
    public static void main(String[] args){
        Connection conexion = null;

        try {
            conexion = Conexiones.getConexion();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }

            UsuarioJDBC usuarioJDBC = new UsuarioJDBC(conexion);

            Usuario usuarioInsertar = new Usuario("Pedrito", "145879654");
                usuarioJDBC.insertar(usuarioInsertar);

            Usuario updateUsuario = new Usuario();
            updateUsuario.setId_persona(1);
            updateUsuario.setUsuario("Jose Enrique");
            updateUsuario.setPassword("1234");
            usuarioJDBC.update(updateUsuario);

            conexion.commit();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            System.out.println("Entramos dentro de rolback");
            try {
                conexion.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }


    }
}
