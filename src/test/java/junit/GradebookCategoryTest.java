package junit;

import org.junit.*;
import static org.junit.Assert.*;
import gradebook.model.*;
import java.util.ArrayList;

public class GradebookCategoryTest {

    @Before
    public void setUp() throws Exception {
    }

    /**
     * Test Gradebook Category Name.
     *
     */
    @Test
    public void testGradebookCategoryName() {
        GradebookCategory gradeCategory = 
            new GradebookCategory("Category", 1);

        assertTrue("Gradebook Category Name",
            gradeCategory.getName().equals("Category"));
    }

    /**
     * Test Gradebook Category Weight Getter .
     *
     */
    @Test
    public void testGradebookCategoryWeight() {
        GradebookCategory gradeCategory = 
            new GradebookCategory("Category", 1);

        assertTrue("Gradebook Category Name",
            gradeCategory.getWeight() == 1);
    }

}
