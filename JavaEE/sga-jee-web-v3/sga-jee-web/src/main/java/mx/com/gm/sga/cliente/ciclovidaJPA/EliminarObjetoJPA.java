
package mx.com.gm.sga.cliente.ciclovidaJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class EliminarObjetoJPA {
    
    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPu");
        EntityManager em = emf.createEntityManager();
        

        //Paso 1. Inicia la transaccion
        //Objecto en estado transitivo
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //Paso 2. Ejecutamos SQL de tipo select
        
        Persona persona1 = em.find(Persona.class, 4);

        //Paso 3. teminar la transacion 3
        tx.commit();
        
        //Objeto en estado detached
        log.debug("objeto encontrado: " + persona1);
        
        //Paso 4. Inicia transaccion 2
        
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        
        
        //Paso 5. Ejecuta SQL que es un delete
        em.remove(em.merge(persona1));
        
        tx2.commit();
        
        //Objeto en estado detached ya eliminado
        log.debug("objeto eliminado: " + persona1);      
        
        
        em.close();
    }
}
