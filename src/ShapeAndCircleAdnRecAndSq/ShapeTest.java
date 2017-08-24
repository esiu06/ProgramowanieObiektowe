package ShapeAndCircleAdnRecAndSq;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Esiu on 2017-08-24.
 */
public class ShapeTest {
    @Test
    public void shapeDefaultGetColorIsFilledTest(){
        Shape shape = new Shape();
        Assert.assertEquals("red", shape.getColor());
        Assert.assertEquals(true, shape.isFilled());
    }

    @Test
    public void shapeDefaultSetColorSetFilledTest(){
        Shape shape = new Shape();
        shape.setColor("yellow");
        shape.setFilled(false);
        Assert.assertEquals("yellow", shape.getColor());
        Assert.assertEquals(false, shape.isFilled());
    }

    @Test
    public void shapeColorBlueFilledFalseGetColorIsFilledTest(){
        Shape shape = new Shape("blue", false);
        Assert.assertEquals("blue", shape.getColor());
        Assert.assertEquals(false, shape.isFilled());
    }

    @Test
    public void shapeColorBlueFilledFalseToStringTest(){
        Shape shape = new Shape("blue", false);
        Assert.assertEquals("A Shape with color of blue and not filled", shape.toString());
    }
}

