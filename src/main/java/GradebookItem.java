package gradebook.model;

/**
 * Gradebook Item implementation.
 *
 *
 * @author Gregory Micek
 *
 */
public class GradebookItem {
    /**
     * Gradebook Item name.
     */
    private final String name;

    /**
     * Gradebook Category.
     */
    private final GradebookCategory category;

    /**
     * Gradebook Grade.
     */
    private final int grade;

    /**
     * Gradebook Item Constructor.
     *
     * @param newName name of Gradebook Item
     * @param newCategory name of Gradebook Category
     * @param newGrade value of grade
     */
    public GradebookItem(final String newName,
        final GradebookCategory newCategory,
        final int newGrade) {
        name = newName;
        category = newCategory;
        grade = newGrade;
    }

    /**
     * Gradebook Category Getter.
     *
     * @return category Gradebook Category
     */
    public final GradebookCategory getGradebookCategory() {
        return category;
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
     * Grade Getter.
     *
     * @return grade Grade
     */
    public final int getGrade() {
        return grade;
    }

}
