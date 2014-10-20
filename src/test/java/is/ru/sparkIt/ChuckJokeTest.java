package is.ru.sparkit;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ChuckJokeTest {
    @Test
    public void chuckNorrisNameInRandomJoke() {
        ChuckJoke chuck = new ChuckJoke();
        String name = "Chuck Norris";
        assertTrue(chuck.getRandom().contains(name));
    }
}
