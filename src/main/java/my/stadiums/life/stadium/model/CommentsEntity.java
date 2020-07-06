package my.stadiums.life.stadium.model;

import my.stadiums.life.auth.model.UserEntity;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.io.Serializable;


@Entity(name = "Comment")
@Table(name = "comments")
public class CommentsEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "comment")
    private String comment;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "stadium_id", nullable = false)
    private StadiumEntity stadium;
    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StadiumEntity getStadium() {
        return stadium;
    }

    public void setStadium(StadiumEntity stadium) {
        this.stadium = stadium;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;

    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
}
