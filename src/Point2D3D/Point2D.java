package Point2D3D;

public class Point2D {
    private float _x = 0.0f;
    private float _y = 0.0f;

    public Point2D(){}
    public Point2D(float x, float y){
        _x = x;
        _y = y;
    }
    public float getX(){
        return _x;
    }
    public void setX(float x) {
        _x = x;
    }

    public float getY() {
        return _y;
    }

    public void setY(float y) {
        _y = y;
    }
    public float[] getXY(){
        float[] XY = {_x, _y};
        return XY;
    }
    public void setXY(float x, float y){
        _x = x;
        _y = y;
    }
    public String toString() {
        return String.format("Point2D[x=%f,y=%f]",_x, _y);
    }
}
