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
    /**
     * Compute grade using grading scheme.
     *
     * @param gradebookItems List of student gradebook items.
     * @return int number grade
     */
    int computeGrade(ArrayList<GradebookItem> gradebookItems);

    /**
     * Compute letter grade using grading scheme.
     *
     * @param numericAverage Numeric average
     * @return char letter grade
     */
    char computeLetterGrade(int numericAverage);
}
