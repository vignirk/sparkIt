package is.ru.sparkit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ChuckJokeTest {

    final ChuckJoke chuck = new ChuckJoke();    

    @Test
    public void chuckNorrisNameInRandomJoke(){
        String name = "Chuck Norris";
        assertTrue(chuck.getRandom().contains(name));
    }

    @Test
    public void specificJokeById(){
        String chuckJoke = chuck.getSpecific(15);
        String joke = "When Chuck Norris goes to donate blood, he declines the syringe, and instead requests a hand gun and a bucket.";
        assertEquals(chuckJoke, joke);
    }
}
