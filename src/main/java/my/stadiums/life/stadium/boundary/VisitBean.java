package my.stadiums.life.stadium.boundary;

import my.stadiums.life.stadium.control.VisitDAO;
import my.stadiums.life.stadium.model.VisitEntity;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class VisitBean implements Serializable {
    @Inject
    private VisitDAO visitDAO;
    private VisitEntity visit;
    private long id;

    public void find() {
        if (id == 0) {
            visit = new VisitEntity();
        } else {
            visit = visitDAO.getVisitsById(id);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VisitEntity getVisit() {
        return visit;
    }
}
