package Abstract;

public class CompanyFactory {
    public static MobileFactory getCompany(String type){
        switch (type){
            case"Oppo":
                return new OppoFactory();
            case"Samsung":
                return new SamsungFactory();
            default:
                return null;
        }
    }
}
