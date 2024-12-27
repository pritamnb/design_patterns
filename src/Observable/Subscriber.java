package Observable;

public class Subscriber {
    String name;
    public Subscriber(String name){
        this.name = name;
    }
    public void subscribe(YouTube channel){
        channel.add(this);
    }
    public void sendNotification(String message){
        System.out.println("Received by : "+name+" "+ message);
    }
}
