package Model;

import java.util.ArrayList;

/**
 * Created by drorsim on 14.4.2018.
 */
public class Logger {
    private ArrayList<Log> logArrayList;

    public Logger(ArrayList<Log> logArrayList) {

        this.logArrayList = logArrayList;
    }

    public ArrayList<Log> getLogArrayList() {
        return logArrayList;
    }

    public void setLogArrayList(ArrayList<Log> logArrayList) {
        this.logArrayList = logArrayList;
    }


}
