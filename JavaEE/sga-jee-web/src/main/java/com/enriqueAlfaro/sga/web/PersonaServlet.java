
package com.enriqueAlfaro.sga.web;

import com.enriqueAlfaro.sga.domain.Persona;
import com.enriqueAlfaro.sga.servicio.PersonaService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/personas")
public class PersonaServlet extends HttpServlet{
    
    //Para poder hacer la llamada al ejb automaticamente, agregamos el @inject CDI=Context and Dependency injection
    
    @Inject
    PersonaService personaService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        List<Persona> personas = personaService.listarPersona();
        System.out.println("Personas: " + personas);
        request.setAttribute("personas", personas);
        request.getRequestDispatcher("/listadoPersonas.jsp").forward(request,response);
    }
}
