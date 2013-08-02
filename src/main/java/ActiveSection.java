package gradebook.model;

/**
 * Business Domain Interface implementation.
 *
 *
 * @author Gregory Micek
 *
 */
public abstract class ActiveSection extends Section {

    public ActiveSection(final int newId,
            final String newName) {
        super(newId, newName);
    }

    public abstract Section findById(int id);

    public abstract void save();

}
