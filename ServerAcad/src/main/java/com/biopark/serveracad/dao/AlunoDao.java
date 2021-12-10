package com.biopark.serveracad.dao;

import com.biopark.serveracad.model.Aluno;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ifta
 */
@RequestScoped
public class AlunoDao {

    @Inject
    EntityManager em;

    public void add(Aluno aluno) {
        em.getTransaction().begin();
        em.persist(aluno);
        em.getTransaction().commit();
    }

    public Aluno aluno(long id) {
        return em.find(Aluno.class, id);
    }

    public List<Aluno> listAlunos() {
        Query query= em.createQuery("from Aluno");
        return query.getResultList();
    }
}
