package my.stadiums.life.stadium.control;

import my.stadiums.life.stadium.model.StadiumEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class StadiumDAO {
    @PersistenceContext
    private EntityManager em;

    public List<StadiumEntity> getAllStadiums() {
        return em.createQuery("select s from Stadium  s", StadiumEntity.class)
                .getResultList();
    }

    public List<StadiumEntity> getAvailableForVotingStadiums() {
        return em.createQuery("select s from Stadium s where s.availableForVoting = true", StadiumEntity.class)
                .getResultList();
    }

    public StadiumEntity getStadiumById(long id) {
        return em.find(StadiumEntity.class, id);
    }

    public void create(StadiumEntity stadium) {
        em.persist(stadium);
    }

    public StadiumEntity update(StadiumEntity stadium) {
        var tmp  = em.merge(stadium);
        return (tmp);
    }
}
