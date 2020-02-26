
package test;
import beans.HolaMundoEjbRemote;
import javax.naming.*;


public class TestHolaMundoJEB {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        try{
            Context jdni = new InitialContext();
            HolaMundoEjbRemote holamundoEJB = (HolaMundoEjbRemote) jdni.lookup("java:global/HolaMundoEjb/HolaMundoEJbImpl!beans.HolaMundoEjbRemote");
            int resultado = 0;
            resultado = holamundoEJB.sumar(5, 3);
            System.out.println("El sultado del EJB es :" + resultado);
        }
        catch(NamingException ex){
            ex.printStackTrace(System.out);
        }
    }
}
