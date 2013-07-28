// package junit;

// import org.junit.*;
// import static org.junit.Assert.*;
// import gradebook.model.*;
// import java.util.ArrayList;
// import java.util.List;

// public class GradingSchemeTwoTest {

//     // Student student1,
//     //         student2,
//     //         student3;

//     // Section section1,
//     //         section2,
//     //         section3;

//     // SchoolClass class1,
//     //             class2,
//     //             class3;

//     // GradebookItem   grade1,
//     //                 grade2,
//     //                 grade3;

//     // GradebookCategory gradeCategory;

//     @Before
//     public void setUp() throws Exception {
//     }

//     /**
//      * Test Class Average.
//      *
//      */
//     @Test
//     public void testClassAverage() {
//         GradingScheme scheme = new Scheme();
//         Student student1 = new Student();
//         Student student2 = new Student();
//         Student student3 = new Student();
//         GradebookCategory gradeCategory = new GradebookCategory("Category", 1);
//         GradebookItem grade1 = new GradebookItem("Item", gradeCategory, 1);
//         GradebookItem grade2 = new GradebookItem("Item", gradeCategory, 2);
//         GradebookItem grade3 = new GradebookItem("Item", gradeCategory, 3);
//         SchoolClass class1 = new SchoolClass();
//         Section section1 = new Section(class1);
//         Section section2 = new Section(class1);
//         Section section3 = new Section(class1);

//         student1.addGrade(grade1);
//         student2.addGrade(grade2);
//         student3.addGrade(grade3);

//         section1.addStudent(student1);
//         section2.addStudent(student2);
//         section3.addStudent(student3);


//         assertTrue("Section1 average 1", section1.computeAverage() == 1);
//         assertTrue("Section1 average 2", section2.computeAverage() == 1);
//         assertTrue("Section1 average 3", section3.computeAverage() == 1);

//         System.out.println("class average:  "+class1.computeAverage(scheme));
//         assertTrue("Class average", class1.computeAverage(scheme) == 2);

//     }

//     /**
//      * Scheme. Grading Scheme object implementation.
//      * Computes a simple average for the class.
//      *
//      */
//     public class Scheme implements GradingScheme {
    
//         public Scheme() {
//         }

//         /**
//          * Simple Average
//          *
//          */
//         public final int computeGrade(ArrayList<GradebookItem> gradebookItems) {
//             if(gradebookItems.isEmpty())
//                 return 0;

//             int sum = 0;
//             for (GradebookItem item : gradebookItems) {
//                 sum += item.getGrade();
//             }
//             return sum / gradebookItems.size();
//         }
        
//         /**
//          * Test letter grade
//          *
//          */
//         public final char computeLetterGrade(ArrayList<GradebookItem> gradebookItems) {
//             return 'A';
//         }

//     }

// }



// // student1 = new Student();
// // student2 = new Student();
// // student3 = new Student();

// // gradeCategory = new GradebookCategory("Category", 1);

// // grade1 = new GradebookItem("Item", gradeCategory, 1);
// // grade2 = new GradebookItem("Item", gradeCategory, 2);
// // grade3 = new GradebookItem("Item", gradeCategory, 3);        

// // class1 = new SchoolClass();
// // section1 = new Section(class1);
// // section2 = new Section(class1);
// // section3 = new Section(class1);
