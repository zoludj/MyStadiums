package my.stadiums.life.stadium.control;

import my.stadiums.life.stadium.model.PlanEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class PlanDAO {
    @PersistenceContext
    private EntityManager em;

    public List<PlanEntity> getAllPlans() {
        return em.createQuery("select p from Plan p", PlanEntity.class)
                .getResultList();
    }

    public PlanEntity getPlanById(long id) {
        return em.find(PlanEntity.class, id);
    }

    public PlanEntity update(PlanEntity plan) {
        var tmp = em.merge(plan);
        return tmp;
    }

    public void create(PlanEntity plan) {
        em.persist(plan);
    }
}
