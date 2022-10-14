import org.joda.time.DateTime;

import java.util.ArrayList;

class Programme {

    public String courseName;
    public ArrayList<Student> courseStudentList;
    public ArrayList<Modules> moduleList;
    public DateTime startDate;
    public DateTime endDate;

    public Programme(String courseName, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourseName(){
        return courseName;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public ArrayList<Student> getStudentList(){
        return courseStudentList;
    }

    public void setStudentList(ArrayList<Student> courseStudentList){
        this.courseStudentList = courseStudentList;
    }

    public ArrayList<Modules> getModuleList(){
        return moduleList;
    }

    public void setModuleList(ArrayList<Modules> moduleList){
        this.moduleList = moduleList;
    }

    public DateTime getStartDate(){
        return startDate;
    }

    public void setStartDate(DateTime startDate){
        this.startDate = startDate;
    }

    public DateTime getEndDate(){
        return endDate;
    }

    public void setEndDate(DateTime endDate){
        this.endDate = endDate;
    }
}