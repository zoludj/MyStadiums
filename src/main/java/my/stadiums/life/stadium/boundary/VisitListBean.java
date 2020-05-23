package my.stadiums.life.stadium.boundary;

import my.stadiums.life.stadium.control.VisitDAO;
import my.stadiums.life.stadium.model.VisitEntity;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class VisitListBean implements Serializable {
    private List<VisitEntity> visits;
    @Inject
    private VisitDAO visitDAO;

    @PostConstruct
    public void init() {
        visits = visitDAO.getAllVisits();
    }

    public List<VisitEntity> getVisits() {
        return visits;
    }
}
