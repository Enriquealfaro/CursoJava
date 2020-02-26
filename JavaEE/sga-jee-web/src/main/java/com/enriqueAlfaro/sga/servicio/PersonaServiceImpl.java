
package com.enriqueAlfaro.sga.servicio;

import com.enriqueAlfaro.sga.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService{

    @Override
    public List<Persona> listarPersona() {
       List<Persona> personas = new ArrayList<>();
       personas.add(new Persona(1,"Enrique", "Alfaro","enrique@gmail.com","45789632"));
       personas.add(new Persona(1,"Pedro", "Montero","montero@gmail.com","879652314"));    
       return personas;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
