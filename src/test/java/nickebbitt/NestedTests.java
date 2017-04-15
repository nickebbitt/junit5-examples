package nickebbitt;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("High-level User Story")
public class NestedTests {


    @Nested
    @DisplayName("Simple Scenario")
    class FeatureOne {

        @Test
        @DisplayName("Test One")
        void testOne() {

        }

        @Test
        @DisplayName("Test Two")
        void testTwo() {

        }

    }

    @Nested
    @DisplayName("More Complex Scenario")
    class FeatureTwo {

        @Test
        @DisplayName("Test One")
        void testOne() {

        }

        @Nested
        @DisplayName("Nested Scenario")
        class SubFeature {

            @Test
            @DisplayName("Test One")
            void testOne() {

            }

        }

    }

}
