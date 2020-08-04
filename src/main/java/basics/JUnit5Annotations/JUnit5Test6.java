package basics.JUnit5Annotations;

import org.junit.jupiter.api.*;

class JUnit5Test6 {
    /*
    @AfterEach
    This annotation denotes that the annotated method should be executed after each test method, analogous to JUnit 4’s @After.
    For example, if the tests need to reset a property after each test, we can annotate a method with @AfterEach for that task.
     */

    @Test
    void firstTest() {
        System.out.println(1);
    }
    @Test
    void secondTest() {
        System.out.println(2);
    }

    @AfterEach
    void after(TestInfo testInfo) {
        String callingTest = testInfo.getTestMethod().get().getName();
        System.out.println(callingTest);
    }
}

