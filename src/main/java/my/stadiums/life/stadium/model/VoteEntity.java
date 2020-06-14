package my.stadiums.life.stadium.model;

import my.stadiums.life.auth.model.UserEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;


@Entity(name = "vote")
@Table(name = "votes")

public class VoteEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;
    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "stadium_id", nullable = false)
    private StadiumEntity stadium;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public StadiumEntity getStadium() {
        return stadium;
    }


    public void setStadium(StadiumEntity stadium) {
        this.stadium = stadium;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VoteEntity that = (VoteEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(user, that.user) &&
                Objects.equals(stadium, that.stadium);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, stadium);
    }

    @Override
    public String toString() {
        return "VoteEntity{" +
                "id=" + id +
                ", user=" + user +
                ", stadium=" + stadium +
                ", plan=" +
                '}';
    }
}
