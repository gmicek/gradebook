package gradebook.model;

/**
 * Business Domain Interface implementation.
 *
 *
 * @author Gregory Micek
 *
 */
public abstract class ActiveClass extends SchoolClass {

    public ActiveClass(final int id,
            final String newName) {
        super(id, newName);
    }

    public abstract SchoolClass findById(int id);

    public abstract void save();

}
