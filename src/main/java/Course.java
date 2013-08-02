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

    private final int id;

    private final String name;

    private final String subject;

    private final int courseNumber;

    private ArrayList<Course> prerequisites;

    /**
     * Course Constructor without prerequisites.
     *
     * @param id Course id.
     * @param newName Course name.
     * @param newSubject Course subject.
     * @param newCourseNumber Course number.
     */
    public Course(final int newId, final String newName,
            final String newSubject,
            final int newCourseNumber) {
        this(newId, newName, newSubject, newCourseNumber, null);
    }

    /**
     * Course Constructor with prerequisites.
     *
     * @param newName Course name.
     * @param newSubject Course subject.
     * @param newCourseNumber Course number.
     * @param newPrereqs Course prerequisites.
     */
    public Course(final int newId,
            final String newName,
            final String newSubject,
            final int newCourseNumber,
            final ArrayList<Course> newPrereqs) {
        id = newId;
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

    /**
     * Return id.
     *
     */
    public int getId() {
        return id;
    }

}
