package my.stadiums.life.stadium.boundary;

import my.stadiums.life.stadium.control.CommentDAO;
import my.stadiums.life.stadium.model.CommentsEntity;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;


@Named
@ViewScoped
public class CommentBean implements Serializable {
    @Inject
    private CommentDAO commentDAO;
    private CommentsEntity comment;
    private long id;

    public void save(){
        if(comment.getId()==null){
            commentDAO.create(comment);
        }else{
            comment =commentDAO.update(comment);
        }
    }

    public void find() {
        if (id == 0) {
            comment = new CommentsEntity();
        } else {
            comment = commentDAO.getCommentById(id);
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CommentsEntity getComment() {
        return comment;
    }
}
