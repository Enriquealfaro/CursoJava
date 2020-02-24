package Controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //1. Precesamos parametros
        String accion = request.getParameter("accion");

        //2. Crear los JavaBeans
        Rectangulo recRequest = new Rectangulo(1, 2);
        Rectangulo recSession = new Rectangulo(3, 4);
        Rectangulo recAplication = new Rectangulo(8, 6);

        //3. Agregamos el javabean a algun alcance
        
        //revisamos la accion proporcionada
        if("agregarVariable".equals(accion)){
            request.setAttribute("rectanguloRequest", recRequest);
            //Alcance session
            HttpSession sesion = request.getSession();
            sesion.setAttribute("rectanguloSesion", recSession);
            
            //Alcance aplication
            ServletContext aplication = this.getServletContext();
            aplication.setAttribute("rectanguloAplicacion", recAplication);
            
            //Agregamos un mensaje
            request.setAttribute("mensaje", "Las variables fueron agregadas");
            
            //4. Redireccionar a la pagina de inicio
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }else if("listarVariable".equals(accion)){
            //4. Redireccionamos al jsp que despliega las variables
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
        }else{
            //4. Redireccionamos a la pagina de inicio
            request.setAttribute("mensaje", "Accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
            //Esta linea no agrega informacion al JSP, ya que no propaga los objetos request o response
            //response.sendRedirect("index.jsp)
        }
    }
}
