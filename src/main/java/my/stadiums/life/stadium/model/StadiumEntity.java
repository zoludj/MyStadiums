package my.stadiums.life.stadium.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

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
}
