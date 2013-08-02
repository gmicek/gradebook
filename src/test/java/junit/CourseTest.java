package junit;

import org.junit.*;
import static org.junit.Assert.*;
import gradebook.model.*;
import java.util.ArrayList;

public class CourseTest {

    String courseName,
        courseSubject;
    int courseNumber;
    ArrayList<Course> prerequisites;
    int id = 1;

    @Before
    public void setUp() throws Exception {

        // setup for Course basic test
        courseName = "Course Name";
        courseSubject = "Course Subject";
        courseNumber = 1;

        // prerequisite list
        prerequisites = new ArrayList<Course>();
        Course course1 = new Course(id, courseName,
                                    courseSubject,
                                    courseNumber);
        prerequisites.add(course1);
    }

    /**
     * Test Constructor without prereq.
     *
     */
    @Test
    public void testCourseNoPrereqs() {
        Course course = new Course(id, courseName,
                                    courseSubject,
                                    courseNumber);

        assertTrue("course id",
            course.getId() == 1);
        assertTrue("Course Name Getter", 
            course.getName().equals("Course Name"));

        assertTrue("Course Subject Getter", 
            course.getSubject().equals("Course Subject"));

        assertTrue("Course Number Getter", 
            course.getNumber() == 1);

        assertTrue("Course Prereq Getter", 
            course.getPrereqs() == null);

    }

    /**
     * Test constructor with prereq.
     *
     */
    @Test
    public void testCourseWithPrereqs() {
        Course course = new Course(id, courseName,
                                    courseSubject,
                                    courseNumber,
                                    prerequisites);

        assertTrue("course id",
            course.getId() == 1);
        assertTrue("Course Name Getter", 
            course.getName().equals("Course Name"));

        assertTrue("Course Subject Getter", 
            course.getSubject().equals("Course Subject"));

        assertTrue("Course Number Getter", 
            course.getNumber() == 1);

        assertTrue("Course Prereq Getter", 
            course.getPrereqs().equals(prerequisites));

    }


}
