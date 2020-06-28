package my.stadiums.life.stadium.boundary;

import my.stadiums.life.auth.boundary.CurrentUser;
import my.stadiums.life.auth.control.UserDAO;
import my.stadiums.life.auth.model.UserEntity;
import my.stadiums.life.stadium.control.CommentDAO;
import my.stadiums.life.stadium.control.StadiumDAO;
import my.stadiums.life.stadium.model.CommentsEntity;
import my.stadiums.life.stadium.model.StadiumEntity;
import my.stadiums.life.stadium.model.VoteEntity;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Optional;


@Named
@ViewScoped
public class CommentBean implements Serializable {
    @Inject
    private CommentDAO commentDAO;
    @Inject
    private StadiumDAO stadiumDAO;
    @Inject
    private UserDAO userDAO;
    private String value;
    private CommentsEntity comment;
    private CurrentUser currentUser;
    private long id;

    public String save(String stadiumId, String userId) {
        comment = new CommentsEntity();
        StadiumEntity stadium = stadiumDAO.getStadiumById(Long.parseLong(stadiumId));
        Optional<UserEntity> user = userDAO.findUser(userId);
        comment.setStadium(stadium);
        comment.setUser(user.get());
        comment.setComment(value);
        if (comment.getId() == null) {
            commentDAO.create(comment);
        } else {
            comment = commentDAO.update(comment);
        }
        return "/app/stadium.xhtml?faces-redirect=true";
    }

    public void find() {
        if (id == 0) {
            comment = new CommentsEntity();
        } else {
            comment = commentDAO.getCommentById(id);
        }

    }

    public CommentDAO getCommentDAO() {
        return commentDAO;
    }

    public void setCommentDAO(CommentDAO commentDAO) {
        this.commentDAO = commentDAO;
    }

    public CommentsEntity getComment() {
        return comment;
    }

    public void setComment(CommentsEntity comment) {
        this.comment = comment;
    }

    public CurrentUser getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(CurrentUser currentUser) {
        this.currentUser = currentUser;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}


