package my.stadiums.life.stadium.model;
import javax.persistence.*;


@Entity (name = "Country")
@Table(name = "countries")
public class CountryEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column (name = "country_name", nullable = false)
    private String country_name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }
}
