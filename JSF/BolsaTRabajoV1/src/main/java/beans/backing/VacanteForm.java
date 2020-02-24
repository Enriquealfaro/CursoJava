
package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named //Para que pueda ser reconocido por los JSF
@RequestScoped
public class VacanteForm {
    
    @Inject //Con esto podemos usar nuestro objeto en el model dentro de este otro objeto de VacanteForm
    private Candidato candidato;
    
    Logger log = LogManager.getRootLogger();
    
    
    public VacanteForm(){
        log.info("Creando el objeto VacanteForm");
    }
    
    public void setCandidato(Candidato candidato){
        this.candidato = candidato;
    }
    
    public String enviar(){
        if(this.candidato.getNombre().equals("Juan")){
            if(this.candidato.getApellido().equals("Perez")){
                String msg = "Gracias, pero Juan Perez ya trabaja con nosotros";
                FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg,msg);
                FacesContext facasContext = FacesContext.getCurrentInstance();
                String componentId = null;//este es un mensaje global 
                facasContext.addMessage(componentId, facesMessage);
                return "index";
            }
            log.info("Entrando al caso de existo");
            return "exito";
        }else{
            log.info("Entrando al caso de fallo");
            return "fallo";
        }
    }
}
