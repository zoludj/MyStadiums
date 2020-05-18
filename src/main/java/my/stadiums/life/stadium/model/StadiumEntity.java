package my.stadiums.life.stadium.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;


@Entity(name ="Stadium")
@Table (name ="stadiums")
public class StadiumEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column (name = "name", length = 50, nullable = false)
    private String name;
    @Column (name = "capacity", length = 50, nullable = false)
    private int capacity;
    @Column (name = "sponsor", length = 100, nullable = false)
    private String sponsor;
    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "city_id", nullable = false)
    private CityEntity city;

    public CityEntity getCity() {
        return city;
    }

    public void setCity(CityEntity city) {
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StadiumEntity that = (StadiumEntity) o;
        return capacity == that.capacity &&
                Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(sponsor, that.sponsor) &&
                Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, capacity, sponsor, city);
    }

    @Override
    public String toString() {
        return "StadiumEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", sponsor='" + sponsor + '\'' +
                ", city=" + city +
                '}';
    }
}
