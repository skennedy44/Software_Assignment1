

import java.util.ArrayList;


class Modules {

    public String modName;
    public String modID;
    public ArrayList<Student> studentList;
    public Lecturer lecturer;

    public Modules(String modName, String modID){
        this.modName = modName;
        this.modID = modID;
    }

    public String getModName(){
        return modName;
    }

    public void setModName(String modName){
        this.modName = modName;
    }

    public String getModID(){
        return modID;
    }

    public void setModID(String modID){
        this.modID = modID;
    }

    public ArrayList<Student> getStudentList(){
        return studentList;
    }

    public void setStudentList(ArrayList studentList){
        this.studentList = studentList;
    }

    public Lecturer getLecturer(){
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer){
        this.lecturer = lecturer;
    }

}
