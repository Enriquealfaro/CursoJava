package com.enriqueAlfaro.sga.servicio;

import com.enriqueAlfaro.sga.datos.PersonaDao;
import com.enriqueAlfaro.sga.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
<<<<<<< HEAD
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService {
    
=======
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService{

>>>>>>> proyectosTrabajo
    @Inject
    private PersonaDao personaDao;
    
    @Override
    public List<Persona> listarPersona() {
<<<<<<< HEAD
        return personaDao.findAllPersonas();
=======
       return  personaDao.findAllPersonas();
>>>>>>> proyectosTrabajo
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
<<<<<<< HEAD
        personaDao.insertPersona(persona);
=======
      personaDao.insertPersona(persona);
>>>>>>> proyectosTrabajo
    }
    
    @Override
    public void modificarPersona(Persona persona) {
<<<<<<< HEAD
        personaDao.updatePersona(persona);
=======
       personaDao.updatePersona(persona);
>>>>>>> proyectosTrabajo
    }
    
    @Override
    public void eliminarPersona(Persona persona) {
<<<<<<< HEAD
        personaDao.deletePersona(persona);
=======
       personaDao.deletePersona(persona);
>>>>>>> proyectosTrabajo
    }
    
}
