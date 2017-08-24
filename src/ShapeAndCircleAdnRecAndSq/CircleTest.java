package ShapeAndCircleAdnRecAndSq;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Esiu on 2017-08-24.
 */
public class CircleTest {
    @Test
    public void circleDefaultGetRadiusTest(){
        Circle circle = new Circle();
        Assert.assertEquals(1.0, circle.getRadius(),0.1);
    }
    @Test
    public void circleDefaultSetRadiusTest(){
        Circle circle = new Circle();
        circle.setRadius(3.0);
        Assert.assertEquals(3.0, circle.getRadius(),0.1);
    }
    @Test
    public void circleDefaultAreaTest(){
        Circle circle = new Circle();
        Assert.assertEquals(3.14, circle.getArea(),0.1);
    }
    @Test
    public void circleDefaultToStingTest(){
        Circle circle = new Circle();
        Assert.assertEquals("A Circle with radius=1.0A Shape with color of red and filled", circle.toString());
    }
    @Test
    public void circleRadius2GetRadiusTest(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(2.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleRadius2SetRadiusTest(){
        Circle circle = new Circle(2.0);
        circle.setRadius(3.0);
        Assert.assertEquals(3.0, circle.getRadius(), 0.1);
    }


    @Test
    public void circleRadius2GetAreaTest(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(12.56, circle.getArea(), 0.01);
    }

    @Test
    public void circleRadius2StingTest(){
        Circle circle = new Circle(2.0, "yellow", false);
        Assert.assertEquals("A Circle with radius=2.0A Shape with color of yellow and not filled", circle.toString());
    }


}
