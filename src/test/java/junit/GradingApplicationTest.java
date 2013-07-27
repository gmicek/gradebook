package junit;

import org.junit.*;
import static org.junit.Assert.*;
import gradebook.model.*;

public class GradingApplicationTest {

    String name,name2;
    int num;

    @Before
    public void setUp() throws Exception {
        name = "blah";
        name2 = "blah2";
        num = 4;
    }

    @Test
    public void testOneThing() {
        Course course = 
            new Course(name,num,name2);
        assertTrue("This fails.", false);
        assertTrue("This is true.", true);
        assertFalse("This works.", false);
        assertFalse("This doesn't.", true);
    }
}
