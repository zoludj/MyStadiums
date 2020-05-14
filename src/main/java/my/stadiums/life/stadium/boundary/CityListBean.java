package my.stadiums.life.stadium.boundary;


import my.stadiums.life.stadium.control.CityDAO;
import my.stadiums.life.stadium.model.CityEntity;
import my.stadiums.life.stadium.model.StadiumEntity;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class CityListBean implements Serializable {

    private List <CityEntity> cities;
    @Inject
    private CityDAO cityDAO;

    @PostConstruct
    public void goal (){
        cities = cityDAO.getAllCities();

    }

    public List<CityEntity> getCities() {
        return cities;
    }
}
