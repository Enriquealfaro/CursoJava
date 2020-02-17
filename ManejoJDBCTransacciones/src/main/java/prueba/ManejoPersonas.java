package prueba;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ManejoPersonas {
    public static void main(String[] args){

        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }

            PersonaJDBC personajdbc = new PersonaJDBC(conexion);
            Persona cambioPersona = new Persona();
            cambioPersona.setId_persona(2);
            cambioPersona.setNombre("Marcosetr");
            cambioPersona.setApellido("Menendes");
            cambioPersona.setEmail("medes@gmail.com");
            cambioPersona.setTelefono("875693");
            personajdbc.update(cambioPersona);

            Persona insertPersona = new Persona();
            insertPersona.setNombre("Brat");
            insertPersona.setApellido("Castillo");
            insertPersona.setEmail("medes@gmail.com");
            insertPersona.setTelefono("875693");
            personajdbc.insert(insertPersona);

            conexion.commit();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
}
