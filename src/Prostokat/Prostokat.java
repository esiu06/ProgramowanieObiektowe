package Prostokat;

import javafx.scene.shape.Rectangle;

/**
 * Created by Esiu on 2017-08-22.
 */
public class Prostokat {
    private float _length = 1.0f;
    private float _width = 1.0f;

    public Prostokat(){}
    public Prostokat(float length, float width){
        _length = length;
        _width = width;
    }
    public float getLength(){
        return _length;
    }

    public void setLength(float length) {
        _length = length;
    }

    public float getWidth() {
        return _width;
    }

    public void setWidth(float width) {
        _width = width;
    }
    public double getArea(){
        return _length * _width;
    }
    public double getPerimeter(){
        return (2*_width)+(2*_length);
    }
    public String toString() {
        return String.format("Prostokąt[legth=%f,width=%f]",_length,_width);
    }
}
