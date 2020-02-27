/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.sga.cliente.ciclovidaJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author fernandoCentauro
 */
public class ActualizarObjetoSesionLarga {
       static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPu");
        EntityManager em = emf.createEntityManager();
        

        //Paso 1. Inicia la transaccion
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Persona persona1 = em.find(Persona.class, 1);
        log.debug("Objecto encontrado: " + persona1);
        
        //Paso 3. SetValue(nuevoValor)
        persona1.setEmail("prueba@gmail.com");
        
        //Paso 4. Terminar la transaccion 1
        
        tx.commit();
        
        //Objeto en estado de detached
        log.debug("objeto modificado: " +persona1);
        
        
        
        em.close();
    }
}
