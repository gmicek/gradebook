package junit;

import org.junit.*;
import static org.junit.Assert.*;
import gradebook.model.*;
import java.util.ArrayList;
import java.util.List;

public class SectionTest {


    @Before
    public void setUp() throws Exception {
    }

    /**
     * Test Section parent by comparing getter output.
     *
     */
    @Test
    public void testSectionParent() {
        SchoolClass schoolClass = new SchoolClass();
        Section section = new Section();
        
        section.setParentClass(schoolClass);

        assertTrue("Get Section Parent",
            section.getParentClass().equals(schoolClass));
    }

    /**
     * Test Section single student by comparing getter output.
     *
     */
    @Test
    public void testSectionAddStudent() {
        SchoolClass schoolClass = new SchoolClass();
        Section section = new Section();
        section.setParentClass(schoolClass);
        Student student = new Student();

        section.addStudent(student);

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(student);

        assertTrue("Add single student",
            section.getStudents().equals(list));
    }

    /**
     * Test Section multiple students by comparing getter output.
     *
     */
    @Test
    public void testSectionAddStudents() {
        SchoolClass schoolClass = new SchoolClass();
        Section section = new Section();
        section.setParentClass(schoolClass);
        Student student1 = new Student();
        Student student2 = new Student();

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);

        section.addStudent(list);

        assertTrue("Add multiple students",
            section.getStudents().equals(list));

    }

    /**
     * Test Section parent set from School Class.
     *
     */
    @Test
    public void testSectionParentClass() {
        SchoolClass class1 = new SchoolClass();
        Section section = new Section();

        class1.addSection(section);

        assertTrue("section parent set from class", section.getParentClass().equals(class1));

    }

}