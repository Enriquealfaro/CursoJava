package prueba;

import datos.PersonaJDBC;
import domain.Persona;

import java.util.List;

public class ManejoPersonas {
    public static void main(String[] args){
        PersonaJDBC personaJDBC=  new PersonaJDBC();
        //Seleccionar
        List<Persona> personas = personaJDBC.select();

        for(Persona persona : personas){
            System.out.println("Persona:" +persona);
        }
//Para el insertar datos
//        Persona persona = new Persona();
//        persona.setNombre("Enrique");
//        persona.setApellido("Guerrero");
//        persona.setEmail("guerrero@gamil.com");
//        persona.setTelefono("47582314");

        //personaJDBC.insert(persona);

        //Para cambiar datos
        Persona persona = new Persona();
        persona.setId_persona(3);
        persona.setNombre("Riq117");
        persona.setApellido("Meza");
        persona.setEmail("meza@gmail.com");
        persona.setTelefono("14587963");
//
//        personaJDBC.update(persona);

        //Para elimnar datos
       personaJDBC.delete(persona);
    }
}
