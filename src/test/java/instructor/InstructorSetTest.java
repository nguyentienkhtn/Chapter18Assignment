package instructor;

import org.junit.jupiter.api.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class InstructorSetTest {
    InstructorSet instructorSet;
    Instructor instructor1;
    Instructor instructor2;
    Instructor instructor3;
    Set<Instructor> instructorJavaSet = new HashSet<>();
    String str = "";


    @BeforeEach
    void setUp() {
        instructorSet = new InstructorSet();
        instructor1 = new Instructor("Pf", "1", "111");
        instructor2 = new Instructor("Pf", "2", "103");
        instructor3 = new Instructor("Pf", "2", "306");
        instructorJavaSet.add(instructor1);
        instructorJavaSet.add(instructor2);
        instructorJavaSet.add(instructor3);
        Iterator<Instructor> instructorIterator = instructorJavaSet.iterator();
        while(instructorIterator.hasNext())
            str += instructorIterator.next().toString() + " ";

    }

    @Test
    @Order(1)
    void add() {
        instructorSet.add(instructor1);
        instructorSet.add(instructor2);
        instructorSet.add(instructor3);
        Assertions.assertTrue(true);
    }

    @Test
    @Order(2)
    void testToString() {
        assertEquals(str, instructorSet.toString());
    }

    @Test
    @Order(2)
    void search1() {
        Assertions.assertEquals(true, instructorSet.search(instructor1));
    }
    @Test
    @Order(2)
    void search2() {

        Assertions.assertEquals(false, instructorSet.search(new Instructor("Nguyen", "Duc", "306")));
    }
}