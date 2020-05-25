package my.stadiums.life.stadium.boundary;

import my.stadiums.life.stadium.control.VoteDAO;
import my.stadiums.life.stadium.model.VoteEntity;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class VoteListBean implements Serializable {
    private List<VoteEntity> votes;
    @Inject
    private VoteDAO voteDAO;

    @PostConstruct
    public void goal() {
        votes = voteDAO.getAllVotes();
    }

    public List<VoteEntity> getVotes() {
        return votes;
    }
}
