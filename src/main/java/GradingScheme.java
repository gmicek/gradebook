package gradebook.model;

import java.util.ArrayList;

/**
 * Grading Scheme implementation.
 *
 *
 * @author Gregory Micek
 *
 */
public interface GradingScheme {
    public int computeGrade(ArrayList<GradebookItem> gradebookItems);
    public char computeLetterGrade(ArrayList<GradebookItem> gradebookItems);
}
