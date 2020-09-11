package basics.JUnit5Annotations;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class JUnit5Test2 {

    /*
    @ParameterizedTest
    Parameterized tests make it possible to run a test multiple times with different arguments.
    They are declared just like regular @Test methods but use the @ParameterizedTest annotation instead.

    In addition, you must declare at least one source that will provide the arguments for each invocation and then consume the arguments in the test method.

    For example, the following example demonstrates a parameterized test that uses the @ValueSource annotation to specify a String array as the source of arguments.
     */

    @ParameterizedTest
    @ValueSource(strings = {"cali", "bali", "dani"})
    void endsWithI(String str) {
        assertTrue(str.endsWith("i"));
    }
}