package test;

import datos.UsuarioJDBC;
import domain.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ManejoUsuarios {
    public static void main(String[] args){
        /*Codigo para agregar a base de datos*/
          UsuarioJDBC usuarioJDBC = new UsuarioJDBC();
//        Usuario usuario = new Usuario("Pedro", "8547");
//
//        usuarioJDBC.insertar(usuario);

//        /*Codigo para sacar datos de la base de datos*/
//
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios = usuarioJDBC.select();
        for (Usuario usua : usuarios) {
            System.out.println(usua);
        }
            /*Codigo par modificar*/
//        Usuario usuario = new Usuario();
//        usuario.setId_persona(2);
//        usuario.setUsuario("Pedrito");
//        usuario.setPassword("8547");
//
//        usuarioJDBC.update(usuario);


        /*Codigo par eliminar*/
//        usuarioJDBC.delete(usuario);

    }
}
