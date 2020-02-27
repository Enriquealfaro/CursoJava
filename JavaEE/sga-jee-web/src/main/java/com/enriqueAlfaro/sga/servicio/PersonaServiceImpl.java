package com.enriqueAlfaro.sga.servicio;

import com.enriqueAlfaro.sga.datos.PersonaDao;
import com.enriqueAlfaro.sga.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService {
    
    @Inject
    private PersonaDao personaDao;
    
    @Override
    public List<Persona> listarPersona() {
        return personaDao.findAllPersonas();
    }
    
    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDao.findPersonaById(persona);
    }
    
    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDao.findPersonaByEmail(persona);
    }
    
    @Override
    public void registrarPersona(Persona persona) {
        personaDao.insertPersona(persona);
    }
    
    @Override
    public void modificarPersona(Persona persona) {
        personaDao.updatePersona(persona);
    }
    
    @Override
    public void eliminarPersona(Persona persona) {
        personaDao.deletePersona(persona);
    }
    
}
