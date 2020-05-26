package my.stadiums.life.stadium.model;

import javax.inject.Named;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity(name = "Plan")
@Table(name = "plans")
public class PlanEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "Planed_date", nullable = false)
    private LocalDate planed_date;
    @Column(name = "Description")
    private String description;
    @Column (name = "Stadium_name", nullable = false)
    private String Stadium_name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getPlaned_date() {
        return planed_date;
    }

    public void setPlaned_date(LocalDate planed_date) {
        this.planed_date = planed_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStadium_name() {
        return Stadium_name;
    }

    public void setStadium_name(String stadium_name) {
        Stadium_name = stadium_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanEntity that = (PlanEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(planed_date, that.planed_date) &&
                Objects.equals(description, that.description) &&
                Objects.equals(Stadium_name, that.Stadium_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, planed_date, description, Stadium_name);
    }

    @Override
    public String toString() {
        return "PlanEntity{" +
                "id=" + id +
                ", planed_date=" + planed_date +
                ", description='" + description + '\'' +
                ", Stadium_name='" + Stadium_name + '\'' +
                '}';
    }
}