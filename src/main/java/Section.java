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
     * Number Grade.
     *
     * @param scheme Grading Scheme to be used when computing grade
     */
    public final int computeGrade(final GradingScheme scheme) {
        if(students.isEmpty())
            return 0;

        ArrayList<Integer> list = new ArrayList<Integer>();

        // compute individual students grades then add to master list
        for (Student student : students) {
            list.add(student.computeGrade(scheme));
        }

        int sum = 0;
        // sum scores
        for (Integer integer : list) {
            sum += integer.intValue();
        }
        // return average for section
        return sum / list.size();
    }

    /**
     * Letter Grade.
     *
     * @param scheme Grading Scheme to be used when computing grade
     */
    // public final char computeLetterGrade(final GradingScheme scheme) {
    //     return scheme.computeLetterGrade(gradebookItems);
    // }

}
