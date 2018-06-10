package Model;

import java.util.ArrayList;
import java.util.Dictionary;

/**
 * Created by drorsim on 14.4.2018.
 */
public class Question {
    private String id;
    private String question;
    private Dictionary<String,Boolean> options;
    private int difficulty;
    private double timeToAnswer;
    private ArrayList<Comment> cList;
    private TeachingStaff writer;
    private Course course;
    private ArrayList<Test> testArrayList;

    public Question(String id,String question, Dictionary<String, Boolean> options, int difficulty, double timeToAnswer, ArrayList<Comment> cList, TeachingStaff writer, Course course, ArrayList<Test> testArrayList) {

        this.id=id;
        this.question = question;
        this.options = options;
        this.difficulty = difficulty;
        this.timeToAnswer = timeToAnswer;
        this.cList = cList;
        this.writer = writer;
        this.course=course;
        this.testArrayList = testArrayList;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Dictionary<String, Boolean> getOptions() {
        return options;
    }

    public void setOptions(Dictionary<String, Boolean> options) {
        this.options = options;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public double getTimeToAnswer() {
        return timeToAnswer;
    }

    public void setTimeToAnswer(double timeToAnswer) {
        this.timeToAnswer = timeToAnswer;
    }

    public ArrayList<Comment> getcList() {
        return cList;
    }

    public void setcList(ArrayList<Comment> cList) {
        this.cList = cList;
    }

    public TeachingStaff getWriter() {
        return writer;
    }

    public void setWriter(TeachingStaff writer) {
        this.writer = writer;
    }


    public ArrayList<Test> getTestArrayList() {
        return testArrayList;
    }

    public void setTestArrayList(ArrayList<Test> testArrayList) {
        this.testArrayList = testArrayList;
    }

    public static Question getQuestionByID(String id){return null;}

    public void delete(){}


}
