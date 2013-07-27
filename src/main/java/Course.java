package gradebook.model;

import java.util.ArrayList;

/**
 * Course implementation.
 *
 *
 * @author Gregory Micek
 *
 */
public class Course {
    /**
     * Course subject.
     */
    private final String subject;

    /**
     * Course number.
     */
    private final int courseNumber;

    /**
     * Course name.
     */
    private final String name;

    /**
     * Course prerequisites.
     */
    private final ArrayList<Course> prerequisites;

    /**
     * Course Constructor without prerequisites.
     *
     * @param newSubject Course subject.
     * @param newCourseNumber Course number.
     * @param newName Course name.
     */
    public Course(final String newSubject,
        final int newCourseNumber, final String newName) {
        subject = newSubject;
        courseNumber = newCourseNumber;
        name = newName;
        prerequisites = null;
    }

}
