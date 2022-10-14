import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModuleTest {
    Modules module1;
    Lecturer lecturer1;
    ArrayList<Student> sList;

    @BeforeEach
    void setUp() {
        module1= new Modules("Analogue systems", "CT111");
    }

    @Test
    @DisplayName("Testing module name's getters and setters")
    void testModuleNameGettersAndSetters(){
        module1.setModName("Digital Systems");
        assertEquals("Digital Systems", module1.getModName());
    }

    @Test
    @DisplayName("Testing module ID's getters and setters")
    void testModuleIDGettersAndSetters(){
        module1.setModID("EE112");
        assertEquals("EE112", module1.getModID());
    }

    @Test
    @DisplayName("Testing module list of students getters and setters")
    void testModuleStudentListGettersAndSetters(){
        module1.setStudentList(sList);
        assertEquals(sList, module1.getStudentList());
    }

    @Test
    @DisplayName("Testing module lecturer getters and setters")
    void testModuleLecturerListGettersAndSetters(){
        module1.setLecturer(lecturer1);
        assertEquals(lecturer1, module1.getLecturer());
    }
}
