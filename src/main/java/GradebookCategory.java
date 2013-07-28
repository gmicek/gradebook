package gradebook.model;

/**
 * Gradebook Category implementation.
 *
 *
 * @author Gregory Micek
 *
 */
public class GradebookCategory {
    /**
     * Gradebook Category name.
     */
    private final String name;

    /**
     * Gradebook Category weight.
     */
    private final int weight;

    /**
     * Gradebook Category Constructor.
     *
     * @param newName name of the Gradebook Category
     * @param newWeight weight in the Gradebook Category
     */
    public GradebookCategory(final String newName,
        final int newWeight) {
        name = newName;
        weight = newWeight;
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
     * Weight Getter.
     *
     * @return int Weight
     */
    public final int getWeight() {
        return weight;
    }

}
