package nickebbitt;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TaggedTests {

    @Test
    @Tag("integration")
    void integrationTest() {

    }

    @Test
    @Tag("system")
    void systemTest() {

    }

    @Test
    @Tag("end-to-end")
    void endToEndTest() {

    }
}
