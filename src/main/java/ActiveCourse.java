package gradebook.model;

import java.util.ArrayList;

/**
 * Business Domain Interface implementation.
 *
 *
 * @author Gregory Micek
 *
 */
public abstract class ActiveCourse extends Course {

    public ActiveCourse(final int id,
            final String newName,
            final String newSubject,
            final int newCourseNumber) {
        super(id, newName, newSubject, newCourseNumber);
    }

    public ActiveCourse(final int id,
            final String newName,
            final String newSubject,
            final int newCourseNumber,
            final ArrayList<Course> newPrereqs) {
        super(id, newName, newSubject, newCourseNumber, newPrereqs);
    }

    public abstract Course findById(int id);

    public abstract void save();

}
