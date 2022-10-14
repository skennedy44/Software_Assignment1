import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgrammeTest {

    Programme course1;
    Student s1;
    Student s2;
    Modules m2;
    Modules m1;
    ArrayList<Student> studentList;
    ArrayList<Modules> modList;

    @BeforeEach
    void setUp() {
        course1 =  new Programme("ECE", null, null);
    }

    @Test
    @DisplayName("Testing the getters and setters for the course name")
    void testCourseNameGetterAndSetter() {
        course1.setCourseName("EEE");
        assertEquals("EEE", course1.getCourseName());
    }

    @Test
    @DisplayName("Testing the getters and setters for the student list")
    void testStudentListGetterAndSetter() {
        s1= new Student("Stephen", 21, 1, null);
        s2= new Student("Roisin", 22, 2, null);

        studentList= new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);

        course1.setStudentList(studentList);
        assertEquals(studentList, course1.getStudentList());
    }
    @Test
    @DisplayName("Testing the getters and setters for the student list")
    void testModuleListGetterAndSetter() {
        m1= new Modules("Digital systems","CT111" );
        m2= new Modules("Analogue systems", "CT112");

        modList= new ArrayList<Modules>();
        modList.add(m1);
        modList.add(m2);

        course1.setModuleList(modList);
        assertEquals(modList, course1.getModuleList());
    }

    @Test
    @DisplayName("Testing the getters and setters for course start date")
    void testCourseStartDateGetterAndSetter() {
        course1.setStartDate(DateTime.parse("01-08-22"));
        assertEquals(DateTime.parse("01-08-22"), course1.getStartDate());
    }

    @Test
    @DisplayName("Testing the getters and setters for course end date")
    void testCourseEndDateGetterAndSetter() {
        course1.setEndDate(DateTime.parse("01-05-23"));
        assertEquals(DateTime.parse("01-05-23"), course1.getEndDate());
    }

}
