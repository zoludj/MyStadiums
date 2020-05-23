package my.stadiums.life.stadium.control;

import my.stadiums.life.stadium.model.CountryEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CountryDAO {
    @PersistenceContext
    private EntityManager em;

    public List<CountryEntity> getAllCountries() {
        return em.createQuery("select c from Country c", CountryEntity.class)
                .getResultList();
    }

    public CountryEntity getCountryById(long id){
        return em.find(CountryEntity.class,id);

    }

    public void create(CountryEntity country) {
        em.persist(country);
    }

    public CountryEntity update(CountryEntity country) {
        var tmp = em.merge(country);
        return (tmp);

    }

    public void delete(CountryEntity country) {
        var tmp = em.merge(country);
        em.remove(tmp);
    }
}
