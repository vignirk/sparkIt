package is.ru.sparkit;

import net.joningi.icndb.ICNDBClient;

public class ChuckJoke {
    public String getRandom(){
        ICNDBClient client = new ICNDBClient();
        return client.getRandom().getJoke();
    }
}
