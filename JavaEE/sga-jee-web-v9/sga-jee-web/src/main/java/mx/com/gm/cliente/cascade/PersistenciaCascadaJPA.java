/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.cliente.cascade;

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.*;


public class PersistenciaCascadaJPA {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPu");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        
        //Paso 1. Creacion de objeto
        //Objecto en estado transitivo
        Persona persona1 = new Persona("Enrique", "Cascada", "cascada5@gmail.com", "487596");
        
        //Creacion objeto usuario(tiene dependencia con el objecto persona1
        Usuario usuario1 = new Usuario("enrCascada5", "1233", persona1);
        
        //Paso 3. Persistimos el objeto usuario unicamente
        em.persist(usuario1);
        
        //paso 4. commit transaccion
        tx.commit();
        
        //objetos en estado detached
        log.debug("Objeto persistido: " + persona1);
        log.debug("Objeto persistido: " + usuario1);
        
        em.close();
    }
}
