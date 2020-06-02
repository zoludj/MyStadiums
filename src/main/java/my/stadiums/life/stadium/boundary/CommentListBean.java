package my.stadiums.life.stadium.boundary;

import my.stadiums.life.stadium.control.CommentDAO;
import my.stadiums.life.stadium.model.CommentsEntity;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class CommentListBean implements Serializable {
    private List<CommentsEntity> comments;
    @Inject
    private CommentDAO commentDAO;

    @PostConstruct
    public void goal() {
        comments = commentDAO.getAllComments();
    }
public List<CommentsEntity> getComments (){
        return comments;
}
}
