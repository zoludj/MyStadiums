package my.stadiums.life.stadium.boundary;

import my.stadiums.life.auth.boundary.CurrentUser;
import my.stadiums.life.auth.control.UserDAO;
import my.stadiums.life.auth.model.UserEntity;
import my.stadiums.life.stadium.control.StadiumDAO;
import my.stadiums.life.stadium.control.VoteDAO;
import my.stadiums.life.stadium.model.StadiumEntity;
import my.stadiums.life.stadium.model.VoteEntity;


import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Optional;

@Named
@ViewScoped
public class VoteBean implements Serializable {
    @Inject
    private VoteDAO voteDAO;
    @Inject
    private StadiumDAO stadiumDAO;
    @Inject
    private UserDAO userDAO;

    private VoteEntity vote;
    private CurrentUser currentUser;
    private long id;

    public void find() {
        if (id == 0) {
            vote = new VoteEntity();
        } else {
            vote = voteDAO.getVoteById(id);
        }
    }

    public String save(String stadiumId, String userName) {
        vote = new VoteEntity();
        StadiumEntity stadium = stadiumDAO.getStadiumById(Long.parseLong(stadiumId));
        Optional<UserEntity> user = userDAO.findUser(userName);
        vote.setStadium(stadium);
        vote.setUser(user.get());
        if (vote.getId() == null) {
            voteDAO.create(vote);
        } else {
            vote = voteDAO.update(vote);
        }
        return "/app/vote.xhtml?faces-redirect=true";
    }


    public String delete() {
        if (vote.getId() == null) {
            return null;
        }
        voteDAO.delete(vote);
        return "stadiums/app/plan.xhtml?faces-redirect=true";
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

    public CurrentUser getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(CurrentUser currentUser) {
        this.currentUser = currentUser;
    }
}
