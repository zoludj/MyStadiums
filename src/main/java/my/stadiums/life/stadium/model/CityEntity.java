package my.stadiums.life.stadium.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity (name = "City")
@Table (name = "cities")
public class CityEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Column (name = "city_name", length = 50, nullable = false)
    private String city_name;
    @Column (name = "overview", length = 100)
    private String overview;
    @NotNull
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "country_id", nullable = false)
    private CountryEntity country;

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityEntity that = (CityEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(city_name, that.city_name) &&
                Objects.equals(overview, that.overview) &&
                Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city_name, overview, country);
    }

    @Override
    public String toString() {
        return "CityEntity{" +
                "id=" + id +
                ", city_name='" + city_name + '\'' +
                ", overview='" + overview + '\'' +
                ", country=" + country +
                '}';
    }
}

