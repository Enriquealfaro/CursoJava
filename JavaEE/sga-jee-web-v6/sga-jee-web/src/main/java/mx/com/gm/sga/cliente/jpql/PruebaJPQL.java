/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.sga.cliente.jpql;

import java.util.*;
import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.*;

/**
 *
 * @author fernandoCentauro
 */
public class PruebaJPQL {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        String jpql = null;
        Query q = null;
        List<Persona> personas = null;
        Persona persona = null;
        Iterator iter = null;
        Object[] tupla = null;
        List<String> nombres = null;
        List<Usuario> usuarios = null;

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPu");
        EntityManager em = emf.createEntityManager();

        //1. Consulta de todos los objetos de tipo persona
        log.debug("\n1. Consulta de todas las Personas");
        jpql = "select p from Persona p";

        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);

        //2. Consulta de la Persona con id= 1
        log.debug("\n 2. Consulta de la Persona con id = 1");
        jpql = "select p from Persona p where p.idPersona = 1";
        persona = (Persona) em.createQuery(jpql).getSingleResult();
        //log.debug(persona);

        //3. Consulta de la persona por nombre
        jpql = "Select p from Persona p where p.nombre = 'Pedro'";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);

        //4. Consultar de datos individuales, es crea un arreglo(tupla) de tipo object de 3 columnas
        log.debug("\n4. Consulta de datos individuales, se crea un arreglo (tupla) de tipo object de 3 columna");
        jpql = "Select p.nombre as Nombre, p.apellido as apellido, p.email as email from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while (iter.hasNext()) {
            tupla = (Object[]) iter.next();
            String nombre = (String) tupla[0];
            String apellido = (String) tupla[1];
            String email = (String) tupla[2];
            //log.debug("Nombre: " +nombre + " ,apellido : " +apellido+ " ,email: " + email);
        }

        //5. Obtiene el objeto persona y el id, se crea un arreglo de tipo object con 2 columnas
        log.debug("\n5. Obtiene el objeto Persona y el id, se  crea un arreglo de tipo object con 2 columnas");
        jpql = "select p, p.idPersona from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while (iter.hasNext()) {
            tupla = (Object[]) iter.next();
            persona = (Persona) tupla[0];
            int idPersona = (int) tupla[1];
            //log.debug("objecto Persona: " + persona);
            //log.debug("id persona " + idPersona);
        }

        //6. Consultar de todas las personas
        log.debug("\n6. Consultar de todas las personas");
        jpql = "select new mx.com.gm.sga.domain.Persona(p.idPersona) from Persona p";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);

        //7. Regresa el valor minimo y maximo(scaler result)
        log.debug("\n7. Regresa el valor minimo y maximo(scaler result)");
        jpql = "select min(p.idPersona) as minIdPersona, max(p.idPersona) maxIdPersona, count(p.idPersona) as cantidadPersona from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while (iter.hasNext()) {
            tupla = (Object[]) iter.next();
            Integer idMin = (Integer) tupla[0];
            Integer idMax = (Integer) tupla[1];
            Long count = (Long) tupla[2];
            log.debug("idMin: " + idMin + ", idMax: " +idMax+ ", count: " + count);
        }

    }

    private static void mostrarPersonas(List<Persona> personas) {
        for (Persona p : personas) {
            log.debug(p);
        }
    }
}
