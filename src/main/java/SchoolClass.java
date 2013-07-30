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

    private final String name;

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
        this(null);
    }

    /**
     * Class Constructor.
     *
     * @param newName class name
     */
    public SchoolClass(final String newName) {
        sections = new ArrayList<Section>();
        name = newName;
    }

    /**
     * Add a section to this Class.
     *
     * @param newSection new section to add to this Class
     */
    public final void addSection(final Section newSection) {
        sections.add(newSection);
        newSection.setParentClass(this);
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
     * Name Getter.
     *
     * @return name Name
     */
    public final String getName() {
        return name;
    }

    /**
     * Number Grade average for Class using individual Section averages.
     *
     * @param scheme Grading Scheme to be used when computing grade
     * @return number grade average for Class
     */
    public final int computeAverage(final GradingScheme scheme) {
        if (sections.isEmpty()) {
            return 0;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        // compute individual section averages then add to master list
        for (Section section : sections) {
            list.add(section.computeAverage(scheme));
        }

        int sum = 0;
        // sum scores
        for (Integer integer : list) {
            sum += integer.intValue();
        }
        System.out.println("Class list size: " + list.size());
        // return average for section
        return sum / list.size();
    }

    /**
     * Letter Grade.
     *
     * @param scheme Grading Scheme to be used when computing grade
     * @return student letter grade computed from grading scheme
     */
    public final char computeLetterGrade(final GradingScheme scheme) {
        if (sections.isEmpty()) {
                return 0;
        }

        int avg = this.computeAverage(scheme);
        return scheme.computeLetterGrade(avg);

    }
}
