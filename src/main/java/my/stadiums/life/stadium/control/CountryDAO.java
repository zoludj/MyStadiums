package my.stadiums.life.stadium.control;

import my.stadiums.life.stadium.model.CountryEntity;

import javax.ejb.Stateless;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
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
}
