package my.stadiums.life.stadium.boundary;

import my.stadiums.life.auth.model.UserEntity;
import my.stadiums.life.stadium.control.VoteDAO;
import my.stadiums.life.stadium.model.PlanEntity;
import my.stadiums.life.stadium.model.StadiumEntity;
import my.stadiums.life.stadium.model.VoteEntity;

import javax.enterprise.deploy.model.XpathListener;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class VoteBean implements Serializable {
    @Inject
    private VoteDAO voteDAO;

    private VoteEntity vote;
    private UserEntity user;
    private StadiumEntity stadium;
    private long id;

    public void find() {
        if (id == 0){
            vote = new VoteEntity();
        }else{
            vote = voteDAO.getVoteById(id);
        }
    }
    public void save() {
        UserEntity user = new UserEntity();
        user.setId(-1L);
        vote.setUser(user);

        StadiumEntity stadium = new StadiumEntity();
        stadium.setId(-1L);
        vote.setStadium(stadium);

        PlanEntity plan = new PlanEntity();
        plan.setId(-1L);
        vote.setPlan(plan);

        if (vote.getId() == null) {
            voteDAO.create(vote);
        } else {
            vote = voteDAO.update(vote);
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public VoteEntity getVote() {
        return vote;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public UserEntity getUser() {
        return user;
    }

    public StadiumEntity getStadium() {
        return stadium;
    }

    public void setStadium(StadiumEntity stadium) {
        this.stadium = stadium;
    }
}
