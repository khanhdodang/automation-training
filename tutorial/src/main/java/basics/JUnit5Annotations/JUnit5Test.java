package basics.JUnit5Annotations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnit5Test {
    /*
    @Test
    This annotation denotes that a method is a test method. Note this annotation does not take any attributes.
     */
    @Test
    void helloJUnit5() {
        assertEquals(10, 5 + 5);
    }
}
