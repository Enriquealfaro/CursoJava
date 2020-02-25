package com.enriqueAlfaro.sga.servicio;

import com.enriqueAlfaro.sga.domain.Persona;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PersonaService {

    public List<Persona> listarPersona();

    public Persona encontrarPersonaPorId(Persona persona);

    public Persona encontrarPersonaPorEmail(Persona persona);

    public void registrarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);

}