package gradebook.model;

import java.util.ArrayList;

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
     * Gradebook Items.
     */
    private ArrayList<GradebookItem> gradebookItems;

    /**
     * Student Constructor.
     *
     */
    public Student() {
        this(null);
    }

    /**
     * Student Constructor.
     *
     * @param newName name of the student.
     */
    public Student(final String newName) {
        name = newName;
        gradebookItems = new ArrayList<GradebookItem>();
    }

    /**
     * Add Gradebook Items
     *
     * @param newGrade new Gradebook Item to add
     */
    public final void addGrade(final GradebookItem grade) {
        gradebookItems.add(grade);
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
     * Number Grade.
     *
     */
    // public final int computeGrade() {

    // }

    /**
     * Letter Grade.
     *
     */
    // public final char computeLetterGrade() {

    // }
}
