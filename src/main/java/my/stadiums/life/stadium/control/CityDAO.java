package my.stadiums.life.stadium.control;

import my.stadiums.life.stadium.model.CityEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CityDAO {
    @PersistenceContext
    private EntityManager em;


    public List<CityEntity> getAllCities() {
        return em.createQuery("select s from City s", CityEntity.class)
                .getResultList();
    }

    public CityEntity getCityById(long id) {
        return em.find(CityEntity.class, id);
    }

    public CityEntity update (CityEntity city){
        var tmp =  em.merge(city);
        return  tmp;
    }

    public void create(CityEntity city) {
        em.persist(city);
    }
}
