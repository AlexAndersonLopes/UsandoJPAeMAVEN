package br.com.alexlopes.cenaflix3.fabrica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
/**
 * Classe Fabrica
 * @author AlexLopes
 */
public class FabricaJPA {

    private static final String PERSISTENCE_UNIT = "go";

    private static EntityManager em;
    private static EntityManagerFactory fabrica;
    

    public static EntityManager getEntityManager() {
        if (fabrica == null || !fabrica.isOpen()) {
            fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }

        if (em == null || !em.isOpen()) 
        {
            em = fabrica.createEntityManager();
        }

        return em;
    }

    public static void closeEtityManager() {
        if (em.isOpen() && em != null) {
            em.close();
            fabrica.close();
        }
    }
    

}
