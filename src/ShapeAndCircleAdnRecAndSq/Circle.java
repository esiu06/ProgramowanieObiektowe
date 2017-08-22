package ShapeAndCircleAdnRecAndSq;

public class Circle extends Shape{
    private double _radius = 1.0;

    public Circle(){}
    public Circle(double radius){ _radius = radius; }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        _radius = radius;
    }
    public double getRadius() { return _radius; }
    public void setRadius(double radius){ _radius = radius;}

    public double getArea(){
        return Math.PI * Math.pow(_radius, 2d);
    }
    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("A Circle with radius=")
                .append(_radius)
                .append(super.toString());

        return sb.toString();
    }
}
