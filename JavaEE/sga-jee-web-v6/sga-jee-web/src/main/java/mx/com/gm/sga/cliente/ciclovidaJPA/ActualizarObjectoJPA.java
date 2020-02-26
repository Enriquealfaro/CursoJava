
package mx.com.gm.sga.cliente.ciclovidaJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ActualizarObjectoJPA {
        static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPu");
        EntityManager em = emf.createEntityManager();
        

        //Paso 1. Inicia la transaccion
        //Objecto en estado transitivo
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //Paso 2. Ejecutar SQL de tipo select
       Persona persona1 = em.find(Persona.class, 1);

       
       //Pasa 3. terminar la transaccion 1
       tx.commit();
       
       //Objeto en estado detache
       log.debug("Objeto recuperado: " +persona1);
       
       //Paso 4. setValue (nuevo valor)
       persona1.setApellido("Castillo");
       
       //paso 5. Inicia transaccion 2
       EntityTransaction tx2 = em.getTransaction();
       tx2.begin();
       
       //Paso 6. Modificamos el objeto
       em.merge(persona1);
       tx2.commit();
       
       //Objeto en etado detached ya modificado
       log.debug("objeto detached - modificado: " + persona1);
       
       

        em.close();
    }
}
