package Abstract;

public class OppoFactory implements MobileFactory{

    @Override
    public String getMobile(String model) {
        switch (model){
            case"x1":
                return "x1";
            case"x2":
                return "x2";
            default:
                return "";
        }
    }
}
