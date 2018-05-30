import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("An application")
@Fast
public class AppTest {

    private App app;

    @Nested
    public class WhenNew {

        @BeforeEach
        public void createApp() {
            app = new App("An app");
        }

        @Test
        public void mustHaveAName() {
            assertAll("application",
                () -> assertEquals("An app", app.getName())
            );
        }

        @ParameterizedTest
        @ValueSource(strings = {"JUnit 5", "Another thing"})
        public void mustHaveAGreeting(String param) {
            assertEquals(String.format("Hello %s", param), app.getGreeting(param));
        }
    }
}
