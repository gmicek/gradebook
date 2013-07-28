package gradebook.model;

import java.util.ArrayList;

/**
 * Class implementation.
 *
 *
 * @author Gregory Micek
 *
 */
public class SchoolClass {

    /**
     * ArrayList of sections in this class.
     *
     */
    private ArrayList<Section> sections;

    /**
     * Class Constructor.
     *
     */
    public SchoolClass() {
        sections = new ArrayList<Section>();
    }

    /**
     * Add a section to this Class.
     *
     * @param newSection new section to add to this Class
     */
    public final void addSection(final Section newSection) {
        sections.add(newSection);
    }

    /**
     * Add an ArrayList of sections to this Class.
     *
     * @param newSectionList ArrayList of sections to add
     */
    public final void addSection(final ArrayList<Section> newSectionList) {
        for (Section section : newSectionList) {
            sections.add(section);
        }
    }

    /**
     * Getter for SchoolClass sections.
     *
     * @return sections Sections
     */
    public final ArrayList<Section> getSections() {
        return sections;
    }

    /**
     * Compute and return Class Average.
     *
     * @return average average grade for the course
     */
    // public int getAverage() {
    //     return null;
    // }

    /**
     * Compute and return Class letter grade.
     *
     * @return letterGrade average letter grade for the course
     */
    // public char getLetterGrade() {
    //     return null;
    // }
}
