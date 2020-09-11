package basics.JUnit5Annotations;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class JUnit5Test7 {

    /*
    @BeforeAll
    This annotation executes a method before all tests. This is analogous to JUnit 4’s @BeforeClass.
    The @BeforeAll annotation is typically used to initialize various things for the tests.
     */

    @BeforeAll
    static void init() {
        System.out.println("Only run once before all tests");
    }

    @Test
    void firstTest() {
        System.out.println(1);
    }

    @Test
    void secondTest() {
        System.out.println(2);
    }
}
