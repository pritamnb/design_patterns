package Abstract;

public class SamsungFactory implements MobileFactory{

    @Override
    public String getMobile(String model) {
        switch (model){
            case"s1":
                return "s1";
            case"s2":
                return "s2";
            default:
                return "";
        }
    }
}
