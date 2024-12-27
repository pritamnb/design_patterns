package Observable;

import java.util.ArrayList;
import java.util.List;

public class YouTube {
    List<Subscriber> subscribers;
    public YouTube(){
        subscribers = new ArrayList<>();
    }
    public void add(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void update(String message){
        for(Subscriber subscriber: subscribers) {
            subscriber.sendNotification(message);

        }
    }
}
