package lokkentech.javaPattern.observer;

import java.util.Observable;
import java.util.Observer;

public class TvChannel implements Observer {

    @Override
    public void update(Observable o, Object newsItem) {
        if (o instanceof Publisher) {
            System.out.println("Tv : " + (String) newsItem);
        }
    }
    
}
