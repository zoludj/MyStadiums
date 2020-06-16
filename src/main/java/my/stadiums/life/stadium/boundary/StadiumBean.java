package my.stadiums.life.stadium.boundary;

import my.stadiums.life.stadium.control.StadiumDAO;
import my.stadiums.life.stadium.model.StadiumEntity;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class StadiumBean implements Serializable {
    @Inject
    private StadiumDAO stadiumDAO;
    private StadiumEntity stadium;
    private long id;

    public void find() {
        if (id == 0) {
            stadium = new StadiumEntity();
        } else {
            stadium = stadiumDAO.getStadiumById(id);
        }
    }

    public void save() {
        if (stadium.getId() == null) {
            stadiumDAO.create(stadium);
        } else {
            stadium = stadiumDAO.update(stadium);
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public StadiumEntity getStadium() {
        return stadium;
    }
}
