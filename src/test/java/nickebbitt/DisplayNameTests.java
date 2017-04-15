package nickebbitt;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("The display name annotation provides a...")
public class DisplayNameTests {

    @Test
    @DisplayName("way of producing more readable test names")
    void test1() {

    }

    @Test
    void ratherThanSomethingHarderToReadLikeThis() {

    }


}
