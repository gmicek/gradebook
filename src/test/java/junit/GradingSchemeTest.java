package junit;

import org.junit.*;
import static org.junit.Assert.*;
import gradebook.model.*;
import java.util.ArrayList;
import java.util.List;

public class GradingSchemeTest {

    Student student1,
            student2,
            student3;

    Section section1,
            section2,
            section3;

    SchoolClass class1,
                class2,
                class3;

    GradebookItem   grade1,
                    grade2,
                    grade3;

    GradebookCategory gradeCategory;

    @Before
    public void setUp() throws Exception {
        student1 = new Student();
        student2 = new Student();
        student3 = new Student();

        gradeCategory = new GradebookCategory("Category", 1);

        grade1 = new GradebookItem("Item", gradeCategory, 1);
        grade2 = new GradebookItem("Item", gradeCategory, 2);
        grade3 = new GradebookItem("Item", gradeCategory, 3);        

    }

    /**
     * Test Student One Grade (average).
     *
     */
    @Test
    public void testStudentOneGrade() {
        GradingScheme scheme = new Scheme();
        Student student = new Student();
        GradebookItem grade = new GradebookItem("Item", gradeCategory, 1);

        student.addGrade(grade);
        assertTrue("student one grade",
            student.computeGrade(scheme) == 1);
    }

    /**
     * Test Student Multiple Grades (average).
     *
     */
    @Test
    public void testStudentMultipleGrades() {
        GradingScheme scheme = new Scheme();
        Student student = new Student();

        student.addGrade(grade1);
        student.addGrade(grade2);
        student.addGrade(grade3);

        assertTrue("student multiple grades",
            student.computeGrade(scheme) == 2);
    }

    /**
     * Test Student Multiple Grades (List) (average).
     *
     */
    @Test
    public void testStudentMultipleGradesList() {
        GradingScheme scheme = new Scheme();
        Student student = new Student();

        List<GradebookItem> list = new ArrayList<GradebookItem>();
        list.add(grade1);
        list.add(grade2);
        list.add(grade3);

        student.addGrade(list);

        assertTrue("student multiple grades (list)",
            student.computeGrade(scheme) == 2);
    }

    /**
     * Test Student Multiple Grades (List) (average).
     *
     */
    @Test
    public void testSectionAverageScore() {
        GradingScheme scheme = new Scheme();
        Student student = new Student();

        List<GradebookItem> list = new ArrayList<GradebookItem>();
        list.add(grade1);
        list.add(grade2);
        list.add(grade3);

        student.addGrade(list);

        assertTrue("student multiple grades (list)",
            student.computeGrade(scheme) == 2);
    }

    /**
     * Test Section Multiple Grades (List) (average).
     *
     */
    @Test
    public void testSection() {
        GradingScheme scheme = new Scheme();
        SchoolClass class0 = new SchoolClass();
        Section section = new Section(class0);

        student1.addGrade(grade1);
        student2.addGrade(grade2);
        student3.addGrade(grade3);

        section.addStudent(student1);
        section.addStudent(student2);
        section.addStudent(student3);

        assertTrue("Section average", section.computeGrade(scheme) == 2);

    }

    public class Scheme implements GradingScheme {
    
        public Scheme() {
        }

        /**
         * Simple Average
         *
         */
        public final int computeGrade(ArrayList<GradebookItem> gradebookItems) {
            if(gradebookItems.isEmpty())
                return 0;

            int sum = 0;
            for (GradebookItem item : gradebookItems) {
                sum += item.getGrade();
            }
            return sum / gradebookItems.size();
        }
        
        /**
         * Test letter grade
         *
         */
        public final char computeLetterGrade(ArrayList<GradebookItem> gradebookItems) {
            return 'A';
        }

    }
}

