
package com.enriqueAlfaroi.sga.cliente;

import com.enriqueAlfaro.sga.domain.Persona;
import com.enriqueAlfaro.sga.servicio.PersonaServiceRemote;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.*;


public class ClientePersonaService {
    public static void main(String[] args) {
        System.err.println("Iniciando llamada al EJB desde el cliente\n");
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaServiceRemote = (PersonaServiceRemote)jndi.lookup("java:global/sga-Jee/PersonaServiceImpl!com.enriqueAlfaro.sga.servicio.PersonaServiceRemote");
            List<Persona> personas = personaServiceRemote.listarPersona();
            for(Persona persona: personas){
                System.out.println("Personas: " + persona);
            }
            System.err.println("Fin de la llamada del EJB desde el cliente");
        } catch (NamingException ex) {
          ex.printStackTrace(System.out);
        }
    }
}
