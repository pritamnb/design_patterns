package Observable;

public class Main {

    public static void main(String[] args) {
        YouTube fcc = new YouTube();

        Subscriber pritam = new Subscriber("Pritam");

        Subscriber shubham = new Subscriber("Shubham");

        pritam.subscribe(fcc);

        shubham.subscribe(fcc);

        fcc.update("Update notification!");
    }
}
