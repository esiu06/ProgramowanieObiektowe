package AbstractShape;

public class Rectangle extends Shape {
    protected double _widht = 1.0;
    protected double _length = 1.0;

    public Rectangle(){}
    public Rectangle(double widht, double length){
        _widht = widht;
        _length = length;
    }
    public Rectangle(double widht, double length, String color, boolean filled){
        super(color, filled);
        _widht = widht;
        _length = length;
    }
    public double getWidht(){return _widht;}

    public void setWidht(double widht) {
        _widht = widht;
    }

    public double getLength() {
        return _length;
    }

    public void setLength(double length) {
        _length = length;
    }

    @Override
    public double getArea(){return _length * +_widht;}
    @Override
    public double getPerimeter(){return 2* _length + 2*_widht;}

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A Rectangle with width=")
                .append(_widht)
                .append(" and length=")
                .append(_length)
                .append(" which is a subclass of ")
                .append(super.toString());
        return sb.toString();
    }
}
