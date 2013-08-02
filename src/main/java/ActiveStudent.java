package gradebook.model;

/**
 * Business Domain Interface implementation.
 *
 *
 * @author Gregory Micek
 *
 */
public abstract class ActiveStudent extends Student {

    public ActiveStudent(final int id,
            final String newName) {
        super(id, newName);
    }

    public abstract Student findById(int id);

    public abstract void save();

}
