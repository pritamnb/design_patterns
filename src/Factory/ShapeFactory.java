package Factory;

public class ShapeFactory implements Factory {

    @Override
    public Object getInstance(String type) {
        switch(type){
            case "Triangle":
                return new Triangle();
            case "Rectangle":
                return new Rectangle();
            default:
                throw new IllegalArgumentException();
        }
    }
}
