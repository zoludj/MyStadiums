package my.stadiums.life.stadium.boundary;

import my.stadiums.life.stadium.control.PlanDAO;
import my.stadiums.life.stadium.model.PlanEntity;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class PlanListBean implements Serializable {
    private List<PlanEntity> plans;
    @Inject
    private PlanDAO planDAO;

    @PostConstruct
    public void goal() {
        plans = planDAO.getAllPlans();
    }

    public List<PlanEntity> getPlans() {
        return plans;
    }
}
