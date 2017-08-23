package ShapeAndCircleAdnRecAndSq;

public class Square extends Rectangle {
    public Square(){}
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSeid() {
        return getLength();
    }
    public void setSide(double side){
       super.setLength(side);
        super.setWidht(side);
    }

    @Override
    public void setWidht(double side) {
        super.setWidht(side);
        super.setLength(side);
    }

}
