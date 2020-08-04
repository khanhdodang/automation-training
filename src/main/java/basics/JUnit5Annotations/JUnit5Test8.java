package basics.JUnit5Annotations;

import org.junit.jupiter.api.*;

class JUnit5Test8 {
    /*
    @AfterAll
    The @AfterAll annotation is used to execute the annotated method, only after all tests have been executed. This is analogous to JUnit 4’s @AfterClass.
    We use this annotation to tear down or terminate all processes at the end of all tests.
     */

    @Test
    void firstTest() {
        System.out.println(1);
    }
    @Test
    void secondTest() {
        System.out.println(2);
    }

    @AfterAll
    static void after() {
        System.out.println("Only run once after all tests");
    }
}
