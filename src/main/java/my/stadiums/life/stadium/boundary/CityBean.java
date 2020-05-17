package my.stadiums.life.stadium.boundary;


import my.stadiums.life.stadium.control.CityDAO;
import my.stadiums.life.stadium.model.CityEntity;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CityBean implements Serializable {
    @Inject
    private CityDAO cityDAO;
    private CityEntity city;
    private long id;

    public void find() {
        if (id == 0) {
            city = new CityEntity();
        } else {
            city = cityDAO.getCityById(id);
        }
    }

    public void save() {
        if (city.getId() == null) {
            cityDAO.create(city);
        } else {
            city = cityDAO.update(city);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CityEntity getCity() {
        return city;
    }
}
