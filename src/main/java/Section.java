package gradebook.model;

import java.util.ArrayList;

/**
 * Section implementation.
 *
 *
 * @author Gregory Micek
 *
 */
public class Section {

    /**
     * The Class that this Section belongs to.
     *
     */
    private final SchoolClass parentClass;

    /**
     * The Students in this Section.
     *
     */
    private ArrayList<Student> students;

    /**
     * Section Constructor.
     *
     * @param parent The parent of this class
     */
    public Section(final SchoolClass parent) {
        parentClass = parent;
        students = new ArrayList<Student>();
    }

    /**
     * Section's parent Class Getter.
     *
     * @return parentClass parent Class of this Section
     */
    public final SchoolClass getParentClass() {
        return parentClass;
    }

    /**
     * Add students.
     *
     * @param student Students to add
     */
    public final void addStudent(final Student student) {
        students.add(student);
    }

    /**
     * Add a list of students.
     *
     * @param newStudents Students to add
     */
    public final void addStudent(final ArrayList<Student> newStudents) {
        for (Student student : newStudents) {
            students.add(student);
        }
    }

    /**
     * Getter for students list.
     *
     * @return students List of Students
     */
    public final ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * Report average score for Section.
     *
     * @return average average grade for the section
     */
    // public int getAverage() {
    //     return null;
    // }

    /**
     * Compute and return Section letter grade.
     *
     * @return letterGrade average letter grade for the course
     */
    // public char getLetterGrade() {
    //     return null;
    // }

}
