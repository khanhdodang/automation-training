package basics.JUnit5Annotations;

import org.junit.jupiter.api.*;

class JUnit5Test5 {

    /*
    @BeforeEach
    The @BeforeEach annotation denotes that the annotated method should be executed before each test method, analogous to JUnit 4’s @Before.
     */

    @BeforeEach
    void init(TestInfo testInfo) {
        String callingTest = testInfo.getTestMethod().get().getName();
        System.out.println(callingTest);
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
