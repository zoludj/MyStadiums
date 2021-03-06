package my.stadiums.life.stadium.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity(name ="Stadium")
@Table (name ="stadiums")
public class StadiumEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    @Column(name = "capacity", length = 50, nullable = false)
    private int capacity;
    @Column(name = "sponsor", length = 100, nullable = false)
    private String sponsor;
    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "city_id", nullable = false)
    private CityEntity city;
    @OneToMany (mappedBy = "stadium", fetch = FetchType.EAGER)
    private List<VoteEntity> votes = new ArrayList<>();
    @Column(name = "available_for_voting")
    private Boolean availableForVoting;


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

    public List<VoteEntity> getVotes() {
        return votes;
    }

    public void setVotes(List<VoteEntity> votes) {
        this.votes = votes;
    }

    public Boolean getAvailableForVoting() {
        return availableForVoting;
    }

    public void setAvailableForVoting(Boolean availableForVoting) {
        this.availableForVoting = availableForVoting;
    }
}
