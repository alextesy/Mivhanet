package Model;

import java.util.ArrayList;

/**
 * Created by drorsim on 14.4.2018.
 */
public class Logger {
    public static Logger instance=null;

    private ArrayList<Log> logArrayList;

    private Logger() {

        this.logArrayList = new ArrayList<>();
    }
    public static Logger getInstance(){
        if(instance==null) {
            instance = new Logger();
        }
        return instance;
    }

    public void addLog(Log log){
        this.logArrayList.add(log);

    }

    public ArrayList<Log> getLogArrayList() {
        return logArrayList;
    }

    public void setLogArrayList(ArrayList<Log> logArrayList) {
        this.logArrayList = logArrayList;
    }


}
