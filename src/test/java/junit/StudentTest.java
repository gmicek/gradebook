package junit;

import org.junit.*;
import static org.junit.Assert.*;
import gradebook.model.*;
import java.util.ArrayList;

public class StudentTest {

    @Before
    public void setUp() throws Exception {
    }

    /**
     * Test Null Student (used for testing).
     *
     */
    @Test
    public void testNullStudentName() {
        Student student = new Student();
        assertTrue("Null student name", student.getName() == null);
    }

    /**
     * Test Student Name.
     *
     */
    @Test
    public void testStudentName() {
        Student student = new Student("Bob");
        assertTrue("Null student name",
            student.getName().equals("Bob"));
    }

    /**
     * Test Student Add One Grade.
     *
     */
    @Test
    public void testStudentGrades() {
        Student student = new Student("Bob");
        GradebookCategory gradeCategory = new GradebookCategory("Category", 1);
        GradebookItem grade = new GradebookItem("Grade Name", gradeCategory, 1);
        
        student.addGrade(grade);

        ArrayList<GradebookItem> list = new ArrayList<GradebookItem>();
        list.add(grade);

        assertTrue("Student one grade",
            student.getGradebookItems().equals(list));
    }

    /**
     * Test Student Add Multiple Grades.
     *
     */
    @Test
    public void testStudentMultipleGrades() {
        Student student = new Student("Bob");
        GradebookCategory gradeCategory = new GradebookCategory("Category", 1);
        GradebookItem grade1 = new GradebookItem("Grade Name", gradeCategory, 1);
        GradebookItem grade2 = new GradebookItem("Grade Name", gradeCategory, 2);
        GradebookItem grade3 = new GradebookItem("Grade Name", gradeCategory, 3);

        ArrayList<GradebookItem> list = new ArrayList<GradebookItem>();
        list.add(grade1);
        list.add(grade2);
        list.add(grade3);

        student.addGrade(list);

        assertTrue("Student Multiple Grades",
            student.getGradebookItems().equals(list));
    }


}