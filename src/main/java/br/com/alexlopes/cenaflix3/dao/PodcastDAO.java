package br.com.alexlopes.cenaflix3.dao;

import br.com.alexlopes.cenaflix3.fabrica.FabricaJPA;
import br.com.alexlopes.cenaflix3.model.Podcast;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class PodcastDAO {

    /**
     * Metodo para salvar um Podcast no banco de dados
     *
     * @param a
     */
    public void cadastrar(Podcast a) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    /**
     * Metodo que mostra uma lista com os podcast pesquisado por nome, ou vazio
     * para mostrar todos
     *
     * @param a
     * @return
     */
    public List<Podcast> listaPodcast(String a) {
        EntityManager em = FabricaJPA.getEntityManager();
        List<Podcast> lista = null;

        try {
            String textoQuery = "SELECT p FROM Podcast p WHERE p.produtor LIKE :produtor";

            Query consulta = em.createQuery(textoQuery);
            consulta.setParameter("produtor", "%" + a + "%");
            lista = consulta.getResultList();

        } finally {
            FabricaJPA.closeEtityManager();
        }

        return lista;
    }

    /**
     * Metodo para excluir um Podcast recebendo um id
     *
     * @param id
     */
    public void excluirPorId(Long id) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            Podcast podcast = em.find(Podcast.class, id);
            if (podcast != null) {
                em.remove(podcast);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

}
