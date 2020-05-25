package my.stadiums.life.stadium.control;


import my.stadiums.life.stadium.model.VoteEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class VoteDAO {
    @PersistenceContext
    private EntityManager em;

    public List<VoteEntity> getAllVotes() {
        return em.createQuery("select v from vote v", VoteEntity.class)
                .getResultList();
    }

    public void create(VoteEntity vote) {
        em.persist(vote);
    }
    public VoteEntity update (VoteEntity vote){
        var tmp = em.merge(vote);
        return tmp;

    }

    public VoteEntity getVoteById(long id) {
        return em.find(VoteEntity.class, id);
    }
}
