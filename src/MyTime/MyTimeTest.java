package MyTime;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Time;

/**
 * Created by Esiu on 2017-08-26.
 */
public class MyTimeTest {
    @Test
    public void MyTimeGodzina(){
        MyTime Time = new MyTime(12,10,03);
        Assert.assertEquals(12, Time.getGodzina());
    }
    @Test
    public void MyTimeMinuta(){
        MyTime Time = new MyTime(12,10,03);
        Assert.assertEquals(10, Time.getMinuta());
    }
    @Test
    public void MyTimeSekunda(){
        MyTime Time = new MyTime(12,10,03);
        Assert.assertEquals(03, Time.getSekunda());
    }
}
