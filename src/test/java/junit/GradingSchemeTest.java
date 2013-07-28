package junit;

import org.junit.*;
import static org.junit.Assert.*;
import gradebook.model.*;
import java.util.ArrayList;
import java.util.List;

public class GradingSchemeTest {

    @Before
    public void setUp() throws Exception {
    }

    /**
     * Test One Grade (average).
     *
     */
    @Test
    public void testOneGrade() {
        GradingScheme scheme = new Scheme();
        Student student = new Student();
        GradebookCategory gradeCategory = 
            new GradebookCategory("Category", 1);
        GradebookItem grade = new GradebookItem("Item", gradeCategory, 1);

        student.addGrade(grade);
        assertTrue("student one grade",
            student.computeGrade(scheme) == 1);
    }

    /**
     * Test Multiple Grades (average).
     *
     */
    @Test
    public void testMultipleGrades() {
        GradingScheme scheme = new Scheme();
        Student student = new Student();
        GradebookCategory gradeCategory = 
            new GradebookCategory("Category", 1);
        GradebookItem grade1 = new GradebookItem("Item", gradeCategory, 1);
        GradebookItem grade2 = new GradebookItem("Item", gradeCategory, 2);
        GradebookItem grade3 = new GradebookItem("Item", gradeCategory, 3);

        student.addGrade(grade1);
        student.addGrade(grade2);
        student.addGrade(grade3);

        assertTrue("student multiple grades",
            student.computeGrade(scheme) == 2);
    }

    /**
     * Test Multiple Grades (List) (average).
     *
     */
    @Test
    public void testMultipleGradesList() {
        GradingScheme scheme = new Scheme();
        Student student = new Student();
        GradebookCategory gradeCategory = 
            new GradebookCategory("Category", 1);
        GradebookItem grade1 = new GradebookItem("Item", gradeCategory, 1);
        GradebookItem grade2 = new GradebookItem("Item", gradeCategory, 2);
        GradebookItem grade3 = new GradebookItem("Item", gradeCategory, 3);

        List<GradebookItem> list = new ArrayList<GradebookItem>();
        list.add(grade1);
        list.add(grade2);
        list.add(grade3);

        student.addGrade(list);

        assertTrue("student multiple grades (list)",
            student.computeGrade(scheme) == 2);
    }

    public class Scheme implements GradingScheme {
    
        public Scheme() {
        }

        public final int computeGrade(ArrayList<GradebookItem> gradebookItems) {
            if(gradebookItems.isEmpty())
                return -1;

            int sum = 0;
            for (GradebookItem item : gradebookItems) {
                sum += item.getGrade();
            }
            return sum / gradebookItems.size();
        }
        
        public final char computeLetterGrade(ArrayList<GradebookItem> gradebookItems) {
            return 'A';
        }

    }
}

