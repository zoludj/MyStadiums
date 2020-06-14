package my.stadiums.life.stadium.boundary;

import my.stadiums.life.stadium.control.CountryDAO;
import my.stadiums.life.stadium.model.CountryEntity;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CountryBean implements Serializable {
    @Inject
    private CountryDAO countryDAO;
    private CountryEntity country;
    private long id;

    public void find() {
        if (id == 0) {
            country = new CountryEntity();
        } else {
            country = countryDAO.getCountryById(id);
        }
    }

    public void save() {
        if (country.getId() == null) {
            countryDAO.create(country);

        } else {
            country = countryDAO.update(country);

        }

    }
    public String delete() {
        if(country.getId()==null){
            return null;
        }
        countryDAO.delete(country);
        return "/manage/countries.xhtml?faces-redirect=true";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CountryEntity getCountry() {
        return country;
    }


}


