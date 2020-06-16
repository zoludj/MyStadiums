package my.stadiums.life.stadium.boundary;

import my.stadiums.life.stadium.control.StadiumDAO;
import my.stadiums.life.stadium.model.StadiumEntity;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;


@Named
@ViewScoped
public class StadiumAvailableForVotingBean implements Serializable {

    @Inject
    private StadiumDAO stadiumDAO;

    private List<StadiumEntity> stadiums;



    @PostConstruct
    public void goal() {
        stadiums = stadiumDAO.getAvailableForVotingStadiums();
    }

    public List<StadiumEntity> getStadiums() {
        return stadiums;
    }
}
