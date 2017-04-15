package nickebbitt;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterisedTests {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testWithParams(int param) {
        assertTrue(param < 3);
    }

}
