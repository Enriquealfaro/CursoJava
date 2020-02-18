package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String ocupacion = request.getParameter("ocupacion");
        String genero = request.getParameter("genero");
        String musica[] = request.getParameterValues("musica");
        String comentario = request.getParameter("comentario");

        out.print("<html>");
        out.print("<head>");
        out.print("<title> Resultado del Servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Parametros precesados por el servlet:</h1>");
        out.print("<table border='1'>");
        out.print("<tr>");
        out.print("<td>");
        out.print("Usuario");
        out.print("</td>");
        out.print("<td>");
        out.print(usuario);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Password");
        out.print("</td>");
        out.print("<td>");
        out.print(password);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Tecnologia");
        out.print("</td>");
        out.print("<td>");
        for (String tecnologia : tecnologias) {
            out.print(tecnologia);
            out.print(" / ");
        }
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Genero");
        out.print("</td>");
        out.print("<td>");
        out.print(genero);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Ocupacion");
        out.print("</td>");
        out.print("<td>");
        int ocup = Integer.parseInt(ocupacion);
        switch (ocup) {
            case 1:
                out.print("Profesor");
                break;
            case 2:
                out.print("Ingeniero");
                break;
            case 3:
                out.print("Jubilado");
                break;
            case 4:
                out.print("Otro");
                break;

        }
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Musica Favorita");
        out.print("</td>");
        out.print("<td>");
        if (musica != null) {
            for (String m : musica) {
                out.print(m);
                out.print(" / ");
            }
        }else{
            out.print("Musica favorita no seleccionada");
        }

        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Comentario");
        out.print("</td>");
        out.print("<td>");
        out.print(comentario);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("</table");
        out.print("</body>");
        out.print("</html>");
        out.close();
    }

}
