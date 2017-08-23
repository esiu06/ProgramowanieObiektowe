package ShapeAndCircleAdnRecAndSq;

public class Square extends Rectangle {
    private boolean side;

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

    @Override
    public void setLength(double side) {
        super.setWidht(side);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A Square with side=")
                .append(getSide())
                .append(" which is a subclass of ")
                .append(super.toString());
        return sb.toString();
    }

    public boolean getSide() {
        return side;
    }
}
