package my.stadiums.life.stadium.control;

import my.stadiums.life.stadium.model.VisitEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class VisitDAO {
    @PersistenceContext
    private EntityManager em;

    public List<VisitEntity>getAllVisits () {
        return em.createQuery("select v from Visits v", VisitEntity.class)
                .getResultList();
    }
    public VisitEntity getVisitsById (long id){
        return em.find(VisitEntity.class,id);
    }

}
