package junit;

import org.junit.*;
import static org.junit.Assert.*;
import gradebook.model.*;
import java.util.ArrayList;

public class GradebookItemTest {

    @Before
    public void setUp() throws Exception {
    }

    /**
     * Test Gradebook Name.
     *
     */
    @Test
    public void testGradebookName() {
        GradebookCategory gradeCategory = 
            new GradebookCategory("Category", 1);
        GradebookItem grade = new GradebookItem("Name", gradeCategory, 2);

        assertTrue("Gradebook Name",
            grade.getName().equals("Name"));
    }

    /**
     * Test Gradebook Category.
     *
     */
    @Test
    public void testGetGradebookCategory() {
        GradebookCategory gradeCategory = 
            new GradebookCategory("Category", 1);
        GradebookItem grade = new GradebookItem("Name", gradeCategory, 2);

        assertTrue("Gradebook Category",
            grade.getGradebookCategory().equals(gradeCategory));
    }

    /**
     * Test Gradebook Item Value.
     *
     */
    @Test
    public void testGetGradebookValue() {
        GradebookCategory gradeCategory = 
            new GradebookCategory("Category", 1);
        GradebookItem grade = new GradebookItem("Name", gradeCategory, 2);

        assertTrue("Gradebook Value",
            grade.getGrade() == 2);
    }

}
