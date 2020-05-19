package my.stadiums.life.stadium.boundary;

import my.stadiums.life.stadium.model.StadiumEntity;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class StadiumListsBean implements Serializable {
    @PersistenceContext
    private EntityManager em;
    private List<StadiumEntity> stadiums;


    @PostConstruct
    public void goal() {
stadiums = em.createQuery("select s from Stadium s", StadiumEntity.class)
        .getResultList();
    }

    public List<StadiumEntity> getStadiums() {
        return stadiums;
    }
}
