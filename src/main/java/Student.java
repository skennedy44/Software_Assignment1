import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Date;


class Student {

    public String sName;
    public int sAge;
    public DateTime sDOB;
    public int sID;
    public String sUserName;
    public ArrayList<Modules> sModuleList;
    public Programme sCourse;

    public Student(String sName, int sAge, int sID, DateTime sDOB){
        this.sName = sName;
        this.sID = sID;
        this.sAge = sAge;
        this.sDOB = sDOB;
        this.sUserName = sName.concat(Integer.toString(sAge));
    }

    public String getSName(){
        return sName;
    }

    public void setSName(String sName){
        this.sName = sName;
    }

    public int getSAge(){
        return sAge;
    }

    public void setSAge(int sAge){
        this.sAge = sAge;
    }

    public DateTime getSDOB(){
        return sDOB;
    }

    public void setSDOB(DateTime sDOb){
        this.sDOB = sDOb;
    }

    public int getSID(){
        return sID;
    }

    public void setSID(int sId){
        this.sID = sID;
    }

    public String getSUserName(){
        return sUserName;
    }

    public void setSUserName(String sName, int sAge){
        String age = Integer.toString(sAge);
        this.sUserName = sName.concat(age);
    }

    public Programme getSCouse(){
        return sCourse;
    }

    public ArrayList<Modules> getModuleList(){
        return sModuleList;
    }

    public void setModuleList(ArrayList<Modules> sModuleList){
        this.sModuleList = sModuleList;
    }

    public Programme getcourse(){
        return sCourse;
    }

    public void setCourses(Programme sCoruse){
        this.sCourse = sCourse;
    }

}
