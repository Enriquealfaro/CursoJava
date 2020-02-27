package mx.com.gm.sga.cliente.ciclovidaJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import static mx.com.gm.sga.cliente.ciclovidaJPA.PersistirObjetoJPA.log;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;

public class EncontrarObjetoJPA {

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

        //paso 3. Termina la transaccion
        tx.commit();
        log.debug("Objeto recuperado: " + persona1);

        em.close();
    }
}
