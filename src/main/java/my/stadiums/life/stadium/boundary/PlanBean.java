package my.stadiums.life.stadium.boundary;

import my.stadiums.life.stadium.control.PlanDAO;
import my.stadiums.life.stadium.model.PlanEntity;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class PlanBean implements Serializable {
    @Inject
    private PlanDAO planDAO;
    private PlanEntity plan;
    long id;

    public void find() {
        if (id == 0) {
            plan = new PlanEntity();
        } else {
            plan = planDAO.getPlanById(id);
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PlanEntity getPlan() {
        return plan;
    }
}
