package Model;

import Model.Logger;
import Model.User;

/**
 * Created by drorsim on 14.4.2018.
 */
public abstract class Log {
    private String content;
    private User user;
    private Logger logger;

    public Log(String content, User user, Logger logger) {

        this.content = content;
        this.user = user;
        this.logger = logger;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }


}
