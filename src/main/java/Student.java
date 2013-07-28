package gradebook.model;

/**
 * Student implementation.
 *
 *
 * @author Gregory Micek
 *
 */
public class Student {
    /**
     * Student name.
     */
    private final String name;

    /**
     * Student Constructor.
     *
     */
    public Student() {
        name = null;
    }

    /**
     * Student Constructor.
     *
     * @param newName name of the student.
     */
    public Student(final String newName) {
        name = newName;
    }

}
