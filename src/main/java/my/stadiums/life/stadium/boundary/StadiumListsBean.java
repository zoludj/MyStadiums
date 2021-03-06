package my.stadiums.life.stadium.boundary;

import my.stadiums.life.stadium.control.StadiumDAO;
import my.stadiums.life.stadium.model.StadiumEntity;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class StadiumListsBean implements Serializable {

    private List<StadiumEntity> stadiums;

    @Inject
    private StadiumDAO stadiumDAO;


    @PostConstruct
    public void goal() {
        stadiums = stadiumDAO.getAllStadiums();
    }

    public List<StadiumEntity> getStadiums() {
        return stadiums;
    }
}
