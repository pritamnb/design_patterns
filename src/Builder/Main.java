package Builder;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new MobileBuilder()
                .setName("Samsung")
                .setRam(16)
                .setStorage(128)
                .build();
        System.out.println(mobile);
    }

}
