
import org.ermix.Personnel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;


public class PersonnelTest {


    // Verify 'Personnel' initialization
    @Test
    public void test_constructor_initialization() {
        Personnel personnel = new Personnel("John Doe", 30, "Manager");
        assertEquals("John Doe", personnel.getNom());
        assertEquals(30, personnel.getAge());
        assertEquals("Manager", personnel.getPoste());
    }

    // Test 'Personnel' initialization with empty strings
    @Test
    public void test_empty_strings_initialization() {
        Personnel personnel = new Personnel("", 25, "");
        assertEquals("", personnel.getNom());
        assertEquals(25, personnel.getAge());
        assertEquals("", personnel.getPoste());
    }

    // Test 'Personnel' initialization with negative age
    @Test
    public void test_negative_age_initialization() {
        assertThrowsExactly(IllegalArgumentException.class, () -> new Personnel("John Doe", -30, "Manager"));
    }

}