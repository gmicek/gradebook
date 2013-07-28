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
     * Gradebook Item Constructor.
     *
     * @param newName name of Gradebook Item
     * @param newCategory name of Gradebook Category
     */
    public GradebookItem(final String newName,
        final GradebookCategory newCategory) {
        name = newName;
        category = newCategory;
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
}
