package basics.JUnit5Annotations;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("smoke")
class JUnit5Test9 {
    /*
    @Tag
    We can use this annotation to declare tags for filtering tests, either at the class or method level.
    The @Tag annotation is useful when we want to create a test pack with selected tests.
     */

    @Test
    @Tag("login")
    void validLoginTest() {
    }

    @Test
    @Tag("search")
    void searchTest() {
    }
}
