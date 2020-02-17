package datos;

import domain.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UsuarioJDBC {

    private Connection conexionTransaccional;

    private static final String SQL_INSERT = "INSERT INTO usuario (usuario,password) VALUES(?,?)";
    private static final String SQL_SELECT = "SELECT id_usuario,usuario,password FROM usuario";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario=?,password=? WHERE id_usuario=?";
    private static final String SQL_DELTE = "DELETE FROM usuario WHERE id_usuario=?";

    public UsuarioJDBC(){

    }

    public UsuarioJDBC(Connection conexionTransaccional){
        this.conexionTransaccional = conexionTransaccional;
    }

    public int insertar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexionTransaccional!=null ? this.conexionTransaccional : Conexiones.getConexion();
            stmt = conn.prepareStatement(SQL_INSERT);
            System.out.println("Ejecucion del query : " + SQL_INSERT);
            stmt.setString(1,usuario.getUsuario());
            stmt.setString(2,usuario.getPassword());
            rows = stmt.executeUpdate();
            System.out.println("La cantidad de campos modificados son : "+ rows);

        } finally {

            if(this.conexionTransaccional == null){
                Conexiones.close(conn);
            }
            Conexiones.close(stmt);

        }

        return rows;
    }

    public List<Usuario> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> listaUsuario = new ArrayList<Usuario>();

        try {
            conn = Conexiones.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int id_usuario = rs.getInt("id_usuario");
                String usua = rs.getString("usuario");
                String pass = rs.getString("password");

                usuario = new Usuario();
                usuario.setId_persona(id_usuario);
                usuario.setUsuario(usua);
                usuario.setPassword(pass);
                listaUsuario.add(usuario);

            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }finally{
            Conexiones.close(conn);
            Conexiones.close(rs);
            Conexiones.close(stmt);
        }
    return listaUsuario;
    }

    public int update(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexionTransaccional!=null ? this.conexionTransaccional : Conexiones.getConexion();
            stmt = conn.prepareStatement(SQL_UPDATE);
            System.out.println("Ejecutanto el query: " + SQL_UPDATE);
            stmt.setString(1,usuario.getUsuario());
            stmt.setString(2,usuario.getPassword());
            stmt.setInt(3, usuario.getId_persona());
            rows = stmt.executeUpdate();
            System.out.println("Campos modificados: " + rows);

        }
        finally {
            if(this.conexionTransaccional == null){
                Conexiones.close(conn);
            }

            Conexiones.close(stmt);
        }
        return rows;

    }

    public int delete(Usuario usuario){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexionTransaccional!=null ? this.conexionTransaccional : Conexiones.getConexion();
            stmt = conn.prepareStatement(SQL_DELTE);
            stmt.setInt(1,usuario.getId_persona());
            rows = stmt.executeUpdate();
            System.out.println("Filas eliminadas: " + rows);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        finally {
            if(this.conexionTransaccional == null){
                Conexiones.close(conn);
            }

            Conexiones.close(stmt);
        }


        return rows;
    }

}
