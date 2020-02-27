
package com.enriqueAlfaro.sga.datos;

import com.enriqueAlfaro.sga.domain.Persona;
import java.util.List;

<<<<<<< HEAD
=======

>>>>>>> proyectosTrabajo
public interface PersonaDao {
    public List<Persona> findAllPersonas();
    
    public Persona findPersonaById(Persona persona);
    
    public Persona findPersonaByEmail(Persona persona);
    
<<<<<<< HEAD
    public void updatePersona(Persona persona);
    
    public void insertPersona(Persona persona);
    
=======
    public void insertPersona(Persona persona);
    
    public void updatePersona(Persona persona);
    
>>>>>>> proyectosTrabajo
    public void deletePersona(Persona persona);
}
