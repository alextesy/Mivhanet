package Model;

import java.util.Date;

/**
 * Created by drorsim on 14.4.2018.
 */
public class TestDate {
    private Date testdate;
    private String Term;
    private Test test;
    public TestDate(Date testdate, String term, Test test) {

        this.testdate = testdate;
        Term = term;
        this.test = test;
    }

    public Date getTestdate() {
        return testdate;
    }

    public void setTestdate(Date testdate) {
        this.testdate = testdate;
    }

    public String getTerm() {
        return Term;
    }

    public void setTerm(String term) {
        Term = term;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }


}
