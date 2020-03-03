
package com.enrique.alfaro.actions;

import com.enrique.alfaro.model.Persona;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;


public class PersonasAction extends ActionSupport{
    Logger log = LogManager.getLogger(PersonasAction.class);
    
    private Persona persona;
    
    @Override
    public String execute(){
        if(this.persona != null){
            log.info("\n");
            log.info("persona: " +persona);
        }else{
            log.info("Pesona con valor null");
        }
        
        return SUCCESS;
    }


    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
}
