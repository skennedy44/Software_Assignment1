import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LecturerTest {

    Lecturer lecturer1;

    @BeforeEach
    void setUp(){
        lecturer1 = new Lecturer("Sean",35,2,null);
    }

    @Test
    @Order(1)
    @DisplayName("Check correct username is generated")
    void testUsernameGeneration(){
        assertEquals("Sean35", lecturer1.getLecUserName());
    }


    @Test
    @Order(2)
    @DisplayName("Testing getters and setters for lecturer name")
    void testLecturerNameGettersAndSetters(){
        lecturer1.setLecName("Paul");
        assertEquals("Paul", lecturer1.getLecName());
    }

    @Test
    @Order(3)
    @DisplayName("Testing getters and setters for lecture ID")
    void testLecturerIDGetterAndSetters(){
        lecturer1.setLecID(3);
        assertEquals(3, lecturer1.getLecID());
    }

    @Test
    @DisplayName("Test getters and setters for lecture modules")
    void testLecturerDOBGettersAndSetters(){
        lecturer1.setLecDOB(new DateTime("15-12-13"));
        assertEquals(DateTime.parse("15-12-13"), lecturer1.getLecDOB());
    }

    @Test
    @DisplayName("test getter and setters for lecturers modules")
    void testLecturerModuleGetterAndSetters(){
        Modules mod1 = new Modules("programming", "1");
        Modules mod2 = new Modules("chip design", "2");

        ArrayList<Modules> testModules = new ArrayList<>();
        testModules.add(mod2);
        testModules.add(mod1);

        lecturer1.setModuleList(testModules);
        assertEquals(testModules, lecturer1.getModuleList());

    }




}
