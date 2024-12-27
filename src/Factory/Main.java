package Factory;

public class Main {
    public static void main(String[] args) {
        Factory f = new ShapeFactory();
        Shape triangle = (Shape) f.getInstance("Triangle");
        Shape rectangle = (Shape) f.getInstance("Rectangle");
        System.out.println(triangle.getShape() +"\n"+ rectangle.getShape());
    }
}
