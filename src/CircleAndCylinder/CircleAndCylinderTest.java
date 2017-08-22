package CircleAndCylinder;

import org.junit.Assert;
import org.junit.Test;

public class CircleAndCylinderTest {
    @Test

    public void circleAreaTest(){
        Circle circle = new Circle();
        Assert.assertEquals(3.14, circle.getArea(), 0.01);
    }
    @Test

    public void circleDefaulRadiusTest(){
        Circle circle = new Circle();
        Assert.assertEquals(1.0, circle.getRadius(), 0.1);
    }
    @Test

    public void circleAreaRadius2Test(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(12.56, circle.getArea(), 0.01);
    }
    @Test

    public void circleRadius2Test(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(2.0, circle.getRadius(), 0.1);
    }
    @Test

    public void circleRadius2StringTest(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals("Circle[radius=2,000000,color=red]", circle.toString());
    }
    @Test
    public void circleRadius2ColorTest(){
        Circle circle = new Circle( 2.0, "red");
        Assert.assertEquals("red", circle.getColor());
    }
    @Test
    public void cylinderGetHeight (){
        Cylinder cylinder = new Cylinder();
        Assert.assertEquals(1.0, cylinder.getHeight(), 0.1);
    }
    @Test
    public void cylinderGetVolume(){
        Cylinder cylinder = new Cylinder(2.0, 1.0);
        Assert.assertEquals(2.0, 1.0, cylinder.getVolume());
    }
    @Test
    public void cylinderStringTest(){
        Cylinder cylinder = new Cylinder(2.0, 1.0, "red");
        Assert.assertEquals("Circle[radius=2,000000,color=red]", cylinder.toString());

    }

}
