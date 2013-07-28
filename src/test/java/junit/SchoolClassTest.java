package junit;

import org.junit.*;
import static org.junit.Assert.*;
import gradebook.model.*;
import java.util.ArrayList;
import java.util.List;

public class SchoolClassTest {

    @Before
    public void setUp() throws Exception {
    }

    /**
     * Test SchoolClass single section by comparing getter output.
     *
     */
    @Test
    public void testSectionAddStudent() {
        SchoolClass schoolClass = new SchoolClass();
        Section section = new Section(schoolClass);

        schoolClass.addSection(section);

        List<Section> list = new ArrayList<Section>();
        list.add(section);

        assertTrue("Add single section",
            schoolClass.getSections().equals(list));
    }

    /**
     * Test SchoolClass multiple section by comparing getter output.
     *
     */
    @Test
    public void testSectionAddStudents() {
        SchoolClass schoolClass = new SchoolClass();
        Section section1 = new Section(schoolClass);
        Section section2 = new Section(schoolClass);

        ArrayList<Section> list = new ArrayList<Section>();
        list.add(section1);
        list.add(section2);

        schoolClass.addSection(list);

        assertTrue("Add multiple sections",
            schoolClass.getSections().equals(list));

    }

}