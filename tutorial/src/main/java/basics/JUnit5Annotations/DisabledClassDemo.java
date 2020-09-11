package basics.JUnit5Annotations;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class DisabledClassDemo {
    /*
    @Disabled
    The @Disabled annotation is used to disable or skip tests at class or method level.
    This is analogous to JUnit 4’s @Ignore.

    When declared at class level, all @test methods are skipped.
    When we use @Disabled at the method level, only the annotated method is disabled.
     */
    @Test
    void testWillBeSkipped() {
    }
}
