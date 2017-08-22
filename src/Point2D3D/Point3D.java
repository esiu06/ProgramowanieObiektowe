package Point2D3D;

public class Point3D extends Point2D{
    private float _z = 0.0f;

    public Point3D(){
        super();
    }
    public Point3D(float x, float y, float z){
        super(x, y);
        _z = z;
    }
    public float getZ(){
        return _z;
    }

    public void setZ(float z) {
        _z = z;
    }
    public float[] getXYZ(float x, float y, float z){
        getXY();
        _z = z;
        return getXY();
    }
    public void setXYZ(float x, float y, float z) {
        getXY();
        _z = z;
    }

}
