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
     * Course name.
     */
    private final String name;

    /**
     * Course subject.
     */
    private final String subject;

    /**
     * Course number.
     */
    private final int courseNumber;

    /**
     * Course prerequisites.
     */
    private ArrayList<Course> prerequisites;

    /**
     * Course Constructor without prerequisites.
     *
     * @param newName Course name.
     * @param newSubject Course subject.
     * @param newCourseNumber Course number.
     */
    public Course(final String newName,
            final String newSubject,
            final int newCourseNumber) {
        this(newName, newSubject, newCourseNumber, null);
    }

    /**
     * Course Constructor with prerequisites.
     *
     * @param newName Course name.
     * @param newSubject Course subject.
     * @param newCourseNumber Course number.
     * @param newPrereqs Course prerequisites.
     */
    public Course(final String newName,
            final String newSubject,
            final int newCourseNumber,
            final ArrayList<Course> newPrereqs) {
        name = newName;
        subject = newSubject;
        courseNumber = newCourseNumber;
        prerequisites = newPrereqs;
    }

    /**
     * Name Getter.
     *
     * @return name Course Name
     */
    public final String getName() {
        return name;
    }

    /**
     * Subject Getter.
     *
     * @return subject Course Subject
     */
    public final String getSubject() {
        return subject;
    }

    /**
     * Number Getter.
     *
     * @return number Course Number
     */
    public final int getNumber() {
        return courseNumber;
    }

    /**
     * Number Getter.
     *
     * @return number Course Number
     */
    public final ArrayList<Course> getPrereqs() {
        return prerequisites;
    }

}
