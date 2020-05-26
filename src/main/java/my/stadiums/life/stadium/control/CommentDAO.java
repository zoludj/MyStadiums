package my.stadiums.life.stadium.control;

import my.stadiums.life.stadium.model.CommentsEntity;
import net.bootsfaces.C;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CommentDAO {
    @PersistenceContext
    private EntityManager em;


    public List<CommentsEntity> getAllComments() {
        return em.createQuery("select c from Comment c", CommentsEntity.class)
                .getResultList();
    }

    public void create(CommentsEntity comment) {
        em.persist(comment);

    }

    public CommentsEntity update(CommentsEntity comment) {
        var tmp = em.merge(comment);
        return tmp;
    }

    public CommentsEntity getCommentById(Long id) {
        return em.find(CommentsEntity.class, id);
    }
}
