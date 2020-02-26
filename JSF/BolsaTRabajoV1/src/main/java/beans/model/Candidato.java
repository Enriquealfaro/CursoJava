
package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


//Para que pueda ser reconocido por el frameword java serve faceslet JSF
@Named //Para que lo reconosca el index
@RequestScoped //Se da el alcance en este caso request
public class Candidato {
    private String nombre ;
    private String apellido;
    private String salarioDeseado;
    
    Logger log = LogManager.getRootLogger();

    public Candidato(){
        log.info("Creando el objeto Candidato");
        this.setNombre("Introduce tu nombre");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        log.info("modificando la propiedad de nombre:" + this.nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
         log.info("modificando la propiedad de nombre:" + this.apellido);
    }

    public String getSalarioDeseado() {
        return salarioDeseado;
    }

    public void setSalarioDeseado(String salarioDeseado) {
        this.salarioDeseado = salarioDeseado;
         log.info("modificando la propiedad de nombre:" + this.salarioDeseado);
    }
    
}
