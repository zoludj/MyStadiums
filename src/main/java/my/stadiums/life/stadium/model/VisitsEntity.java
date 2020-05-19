package my.stadiums.life.stadium.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity (name = "Visits")
@Table (name = "visits")

public class VisitsEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column (name = "title",nullable = false)
    private String title;
    @Column (name = "visits_date", nullable = false)
    private int visits_date;
    @Column (name = "my_impression", length = 100)
    private String my_impression;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVisits_date() {
        return visits_date;
    }

    public void setVisits_date(int visits_date) {
        this.visits_date = visits_date;
    }

    public String getMy_impression() {
        return my_impression;
    }

    public void setMy_impression(String my_impression) {
        this.my_impression = my_impression;
    }
}
