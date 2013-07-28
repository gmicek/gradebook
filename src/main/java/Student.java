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
     * Add Gradebook Items (List)
     *
     * @param newGrades new Gradebook Items to add
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
     * Number Grade.
     *
     * @param scheme Grading Scheme to be used when computing grade
     */
    public final int computeGrade(final GradingScheme scheme) {
        return scheme.computeGrade(gradebookItems);
    }

    /**
     * Letter Grade.
     *
     * @param scheme Grading Scheme to be used when computing grade
     */
    public final char computeLetterGrade(final GradingScheme scheme) {
        return scheme.computeLetterGrade(gradebookItems);
    }
}
