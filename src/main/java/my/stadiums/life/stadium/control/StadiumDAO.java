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

 public List<StadiumEntity> getAllStadiums  (){
     return em.createQuery("select s from Stadium  s", StadiumEntity.class)
             .getResultList();
    }
    public StadiumEntity getStadiumById(long id){
     return em.find(StadiumEntity.class, id);
    }
}
