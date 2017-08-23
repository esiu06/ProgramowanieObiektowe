package AbstractShape;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("yellow", true) {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        System.out.println(shape);
        Circle circle = new Circle(2.5, "green", true);
        System.out.println(circle);
        Rectangle rec = new Rectangle(2.0, 4.0, "pink", false);
        System.out.println(rec);
    }
}
