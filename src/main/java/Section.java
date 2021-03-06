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

    private final int id;

    private String name;

    private final ArrayList<Student> students;

    /**
     * The Class that this Section belongs to.
     */
    private SchoolClass parentClass;

    /**
     * Section Constructor for debug.
     *
     */
    public Section() {
        id = 1;
        students = new ArrayList<Student>();
    }

    /**
     * Section Constructor with name.
     *
     * @param name Section name
     */
    public Section(final int newId, String newName) {
        id = newId;
        students = new ArrayList<Student>();
        name = newName;
    }

    /**
     * Name Getter.
     *
     * @return name Name
     */
    public String getName() {
        return name;
    }

    /**
     * Name Setter.
     */
    public void setName(String newName) {
        name = newName;
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
     * Section's parent class setter.
     *
     * @param newParentClass parent class of section
     */
    public final void setParentClass(final SchoolClass newParentClass) {
        parentClass = newParentClass;
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
     * Return id.
     *
     */
    public int getId() {
        return id;
    }

    /**
     * Number Grade average for Section using individual students averages.
     *
     * @param scheme Grading Scheme to be used when computing grade
     * @return section average numeric grade
     */
    public final int computeAverage(final GradingScheme scheme) {
        if (students.isEmpty()) {
            return 0;
        }

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
        System.out.println("Section list size: " + list.size());
        // return average for section
        return sum / list.size();
    }

    /**
     * Letter Grade.
     *
     * @param scheme Grading Scheme to be used when computing grade
     * @return student letter grade computed from grading scheme
     */
    public final char computeLetterGrade(final GradingScheme scheme) {
        if (students.isEmpty()) {
            return 0;
        }

        int avg = this.computeAverage(scheme);
        return scheme.computeLetterGrade(avg);

    }

}
