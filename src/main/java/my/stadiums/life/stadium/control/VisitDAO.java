package my.stadiums.life.stadium.control;

import my.stadiums.life.stadium.model.VisitsEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class VisitDAO {
    @PersistenceContext
    private EntityManager em;

    private List<VisitsEntity>getAllVisits () {
        return em.createQuery("select v from Visits v", VisitsEntity.class)
                .getResultList();
    }
    private VisitsEntity getVisitsById (long id){
        return em.find(VisitsEntity.class,id);
    }

}
