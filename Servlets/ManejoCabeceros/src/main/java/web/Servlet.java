package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String metodoHttp = request.getMethod();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> headers HTTP</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Headers HTTP</h1>");
        out.println("<br>");
        out.println("Metodo Http: " + metodoHttp);
        
        String uri = request.getRequestURI();
        out.println("<br>");
        out.println("uri solicitada: " + uri);
        
        //Imprimimos todos los cabeceros disponibles
         out.print("<br>");
          out.print("<br>");
        Enumeration cabeceros = request.getHeaderNames();
        while(cabeceros.hasMoreElements()){
            String nombreCabecero = (String) cabeceros.nextElement();
            out.println("<b> " + nombreCabecero + "</b>: ");
            out.println(request.getHeader(nombreCabecero));
            out.print("<br>");
        }
        
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
