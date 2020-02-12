package prueba;

import datos.PersonaJDBC;
import domain.Persona;

import java.util.List;

public class ManejoPersonas {
    public static void main(String[] args){
        PersonaJDBC personaJDBC=  new PersonaJDBC();
        List<Persona> personas = personaJDBC.select();

        for(Persona persona : personas){
            System.out.println("Persona:" +persona);
        }

        Persona persona = new Persona();
        persona.setNombre("Enrique");
        persona.setApellido("Guerrero");
        persona.setEmail("guerrero@gamil.com");
        persona.setTelefono("47582314");

        //personaJDBC.insert(persona);
    }
}
