
package com.enriqueAlfaroi.sga.cliente;

import com.enriqueAlfaro.sga.domain.Persona;
import com.enriqueAlfaro.sga.servicio.PersonaServiceRemote;
import javax.naming.*;
import org.apache.logging.log4j.*;


public class PruebaManejoTransacicones {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("mx.com.gm.sga.servicio.PersonaServiceRemote#mx.com.gm.sga.servicio.PersonaServiceRemote");
            
            log.debug("Iniciando prueba Manejo Transaccional PersonaService");
            
            //Buscar un objeto persona
            
            Persona persona1 = personaService.encontrarPersonaPorEmail(new Persona(1));
            
            log.debug("Persona recuperada: " + persona1);
        } catch (NamingException ex) {
           log.debug(ex.getMessage());
        }
    }
}
