package Model;

/**
 * Created by drorsim on 14.4.2018.
 */
public class Comment {
    private String content;
    private Question belong;

    public Comment(String content, Question belong) {

        this.content = content;
        this.belong = belong;
    }

    public void deleteC(){

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Question getBelong() {
        return belong;
    }

    public void setBelong(Question belong) {
        this.belong = belong;
    }


}
