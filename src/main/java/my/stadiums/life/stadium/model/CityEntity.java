package my.stadiums.life.stadium.model;

import javax.persistence.*;
import java.io.Serializable;

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
}
