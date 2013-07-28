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

    @Before
    public void setUp() throws Exception {

        // setup for Course basic test
        courseName = "Course Name";
        courseSubject = "Course Subject";
        courseNumber = 1;
        
        // prerequisite list
        prerequisites = new ArrayList<Course>();
        Course course1 = new Course(courseName,
                                    courseSubject,
                                    courseNumber);
        prerequisites.add(course1);
    }

    /**
     * Test getters for creating a course without prereqs.
     *
     */
    @Test
    public void testCourseNoPrereqs() {
        Course course = new Course(courseName,
                                    courseSubject,
                                    courseNumber);

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
     * Test getters for creating a course with prereqs.
     *
     */
    @Test
    public void testCourseWithPrereqs() {
        Course course = new Course(courseName,
                                    courseSubject,
                                    courseNumber,
                                    prerequisites);

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
