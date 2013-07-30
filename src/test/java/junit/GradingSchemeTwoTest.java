package junit;

import org.junit.*;
import static org.junit.Assert.*;
import gradebook.model.*;
import java.util.ArrayList;
import java.util.List;

public class GradingSchemeTwoTest {

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

    GradingScheme scheme;

    @Before
    public void setUp() throws Exception {
        scheme = new Scheme();
        student1 = new Student();
        student2 = new Student();
        student3 = new Student();
        gradeCategory = new GradebookCategory("Category", 1);
        grade1 = new GradebookItem("Item", gradeCategory, 1);
        grade2 = new GradebookItem("Item", gradeCategory, 2);
        grade3 = new GradebookItem("Item", gradeCategory, 3);
        class1 = new SchoolClass();
        
    }

    /**
     * Test Class Average.
     *
     */
    @Test
    public void testClassAverage() {

        section1 = new Section();
        section2 = new Section();
        section3 = new Section();

        // add sections to the class (the class will set the sections parentClass variable)
        class1.addSection(section1);
        class1.addSection(section2);
        class1.addSection(section3);

        student1.addGrade(grade1);
        student2.addGrade(grade2);
        student3.addGrade(grade3);

        section1.addStudent(student1);
        section2.addStudent(student2);
        section3.addStudent(student3);

        assertTrue("Class average", class1.computeAverage(scheme) == 2);

    }

    /**
     * Test Student Letter Grade.
     *
     */
    @Test
    public void testStudentLetterGrade() {
        student1.addGrade(grade1);
        student1.addGrade(grade2);
        student1.addGrade(grade3);

        assertTrue(student1.computeLetterGrade(scheme) == 'A');
    }

    /**
     * Test Section Letter Grade.
     *
     */
    @Test
    public void testSectionLetterGrade() {
        section1 = new Section();

        student1.addGrade(grade1);
        student2.addGrade(grade2);
        student3.addGrade(grade3);

        section1.addStudent(student1);
        section1.addStudent(student2);
        section1.addStudent(student3);
        
        assertTrue(section1.computeLetterGrade(scheme) == 'A');
    }

    /**
     * Test Class Letter Grade.
     *
     */
    @Test
    public void testClassLetterGrade() {
        section1 = new Section();
        section2 = new Section();
        section3 = new Section();

        // add sections to the class (the class will set the sections parentClass variable)
        class1.addSection(section1);
        class1.addSection(section2);
        class1.addSection(section3);

        student1.addGrade(grade1);
        student2.addGrade(grade2);
        student3.addGrade(grade3);

        section1.addStudent(student1);
        section2.addStudent(student2);
        section3.addStudent(student3);

        assertTrue(class1.computeLetterGrade(scheme) == 'A');
    }

    /**
     * Scheme. Grading Scheme object implementation.
     * Computes a simple average for the class.
     *
     */
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
         * Basic letter grade
         *
         */
        public final char computeLetterGrade(int numericAverage) {
            if(numericAverage == 2)
                return 'A';
            return 'F';
        }

    }

}



// student1 = new Student();
// student2 = new Student();
// student3 = new Student();

// gradeCategory = new GradebookCategory("Category", 1);

// grade1 = new GradebookItem("Item", gradeCategory, 1);
// grade2 = new GradebookItem("Item", gradeCategory, 2);
// grade3 = new GradebookItem("Item", gradeCategory, 3);        

// class1 = new SchoolClass();
// section1 = new Section(class1);
// section2 = new Section(class1);
// section3 = new Section(class1);
