package gradebook.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Student implementation.
 *
 *
 * @author Gregory Micek
 *
 */
public class Student {

    private final int id;

    private final String name;

    private ArrayList<GradebookItem> gradebookItems;

    /**
     * Student Constructor for debug.
     *
     */
    public Student() {
        this(1, null);
    }

    /**
     * Student Constructor.
     *
     * @param newName name of the student.
     */
    public Student(final int newId, final String newName) {
        id = newId;
        name = newName;
        gradebookItems = new ArrayList<GradebookItem>();
    }

    /**
     * Add Gradebook Items.
     *
     * @param grade new Gradebook Item to add
     */
    public final void addGrade(final GradebookItem grade) {
        gradebookItems.add(grade);
    }

    /**
     * Add Gradebook Items (List).
     *
     * @param grades new Gradebook Items to add
     */
    public final void addGrade(final List<GradebookItem> grades) {
        for (GradebookItem grade : grades) {
            gradebookItems.add(grade);
        }
    }

    /**
     * Name Getter.
     *
     * @return name Name
     */
    public final String getName() {
        return name;
    }

    /**
     * Gradebook Items Getter.
     *
     * @return gradebookItems GradebookItems
     */
    public final ArrayList<GradebookItem> getGradebookItems() {
        return gradebookItems;
    }

    /**
     * Return id.
     *
     */
    public int getId() {
        return id;
    }

    /**
     * Number Grade.
     *
     * @param scheme Grading Scheme to be used when computing grade
     * @return student grade computed from grading scheme
     */
    public final int computeGrade(final GradingScheme scheme) {
        return scheme.computeGrade(gradebookItems);
    }

    /**
     * Letter Grade.
     *
     * @param scheme Grading Scheme to be used when computing grade
     * @return student letter grade computed from grading scheme
     */
    public final char computeLetterGrade(final GradingScheme scheme) {
        int avg = this.computeGrade(scheme);
        return scheme.computeLetterGrade(avg);
    }

}
