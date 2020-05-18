package my.stadiums.life.stadium.boundary;

import my.stadiums.life.stadium.control.CountryDAO;
import my.stadiums.life.stadium.model.CountryEntity;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class CountryListBean implements Serializable {
    private List<CountryEntity> countries;
    @Inject
    private CountryDAO countryDAO;

    @PostConstruct
    public void goal() {
        countries = countryDAO.getAllCountries();
    }

    public List<CountryEntity> getCountries() {
        return countries;
    }
}
