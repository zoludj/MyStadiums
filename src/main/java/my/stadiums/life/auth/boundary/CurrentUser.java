package my.stadiums.life.auth.boundary;

import my.stadiums.life.auth.model.UserEntity;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class CurrentUser implements Serializable {
    private UserEntity user;

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
