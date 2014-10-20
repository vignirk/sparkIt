package is.ru.sparkit;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class ChuckWeb implements SparkApplication {
    public static void main(String[] args){
        SparkApplication chuckweb = new ChuckWeb();
        chuckweb.init(); 
    }

    public void init(){
        final ChuckJoke chuckjoke = new ChuckJoke();
        
        get(new Route("/"){
            @Override
            public Object handle(Request request, Response response){
                return chuckjoke.getRandom();
            }
        });
    }
}
