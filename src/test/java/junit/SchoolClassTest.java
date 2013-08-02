package junit;

import org.junit.*;
import static org.junit.Assert.*;
import gradebook.model.*;
import java.util.ArrayList;
import java.util.List;

public class SchoolClassTest {

    int id = 1;

    @Before
    public void setUp() throws Exception {
    }

    /**
     * Test get id.
     *
     */
    @Test
    public void testGetid() {
        SchoolClass class1 = new SchoolClass(id, "Name");


        assertTrue("get id", class1.getId() == 1);
    }

    /**
     * Test get name.
     *
     */
    @Test
    public void testGetName() {
        SchoolClass class1 = new SchoolClass(id, "Name");


        assertTrue("get name Name", class1.getName().equals("Name"));
    }

    /**
     * Test SchoolClass single section by comparing getter output.
     *
     */
    @Test
    public void testSectionAddStudent() {
        SchoolClass schoolClass = new SchoolClass();
        Section section = new Section();
        section.setParentClass(schoolClass);

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
        Section section1 = new Section();
        section1.setParentClass(schoolClass);
        Section section2 = new Section();
        section2.setParentClass(schoolClass);

        ArrayList<Section> list = new ArrayList<Section>();
        list.add(section1);
        list.add(section2);

        schoolClass.addSection(list);

        assertTrue("Add multiple sections",
            schoolClass.getSections().equals(list));

    }

    /**
     * Test child section.
     *
     */
    @Test
    public void testAddSection() {
        SchoolClass class1 = new SchoolClass(id, "Name");
        Section section1 = new Section();
        class1.addSection(section1);


        assertTrue("get name Name", class1.getName().equals("Name"));
    }

    /**
     * Test get name null constructor.
     *
     */
    @Test
    public void testGetNameNull() {
        SchoolClass class1 = new SchoolClass();

        assertTrue("get name null", class1.getName() == null);

    }
}