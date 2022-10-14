
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
import org.joda.time.DateTime;

import java.util.Date;
import java.util.ArrayList;

    public class Lecturer {

        public String lecName;
        public int lecAge;
        public DateTime lecDOB;
        public int lecID;
        public String lecUserName;
        public ArrayList<Modules> moduleList;

        public Lecturer(String lecName, int lecAge, int lecID, DateTime lecDOB){
            this.lecName = lecName;
            this.lecAge = lecAge;
            this.lecID = lecID;
            this.lecDOB = lecDOB;
            this.lecUserName = lecName.concat(Integer.toString(lecAge));
        }


        public String getLecName(){
            return lecName;
        }

        public void setlecName(String lecName){
            this.lecName = lecName;
        }

        public int getLecAge(){
            return lecAge;
        }

        public void setLecAge(int lecAge){
            this.lecAge = lecAge;
        }

        public DateTime getLecDOB(){
            return lecDOB;
        }

        public void setLecDOB(DateTime lecDOB){
            this.lecDOB = lecDOB;
        }

        public int getLecID(){
            return lecID;
        }

        public void setLecID(int lecID){
            this.lecID = lecID;
        }

        public String getLecUserName(){
            return lecUserName;
        }

        public void setLecUserName(String lecName, int lecAge){
            String age = Integer.toString(lecAge);
            this.lecUserName = lecName.concat(age);
        }

        public ArrayList<Modules> getModuleList(){
            return moduleList;
        }

        public void setModuleList(ArrayList<Modules> modules){
            this.moduleList = moduleList;
        }
    }



