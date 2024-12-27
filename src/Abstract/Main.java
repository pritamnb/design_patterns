package Abstract;

public class Main {

    public static void main(String[] args) {
        MobileFactory oppoFactory = CompanyFactory.getCompany("Oppo");
        MobileFactory samsungFactory = CompanyFactory.getCompany("Samsung");
        System.out.println(oppoFactory.getMobile("x1"));
        System.out.println(samsungFactory.getMobile("s1"));

    }
}
