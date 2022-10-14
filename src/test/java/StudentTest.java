import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    Student student1;

    @BeforeEach
    void setUp() {
        student1 = new Student("Stephen", 21, 44,  DateTime.parse("2000-12-15"));

    }

    @Test
    @Order(1)
    @DisplayName("Checks if the correct username is generated")
    void testUsernameGeneration() {
        assertEquals("Stephen21", student1.getSUserName());
    }

    @Test
    @Order(2)
    @DisplayName("Testing getters and setters for student's name")
    void testStudentNameGettersAndSetters() {
        student1.setSName("Sean");
        assertEquals("Sean", student1.getSName());
    }
}
