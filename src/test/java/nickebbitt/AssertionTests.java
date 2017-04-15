package nickebbitt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertionTests {

    @Test
    void ungroupedAssertions() {

        assertTrue(false, "this test fails here");
        assertTrue(true, "so we never perform this assertion");

    }

    @Test
    void groupedAssertions() {

        assertAll(
           "all of these assertions",
                () -> assertTrue(true, "are performed"),
                () -> assertTrue(false, "even if the"),
                () -> assertTrue(false, "previous one failed")
        );

    }
}
