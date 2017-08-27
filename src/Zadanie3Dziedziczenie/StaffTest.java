package Zadanie3Dziedziczenie;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Esiu on 2017-08-27.
 */
public class StaffTest {

    @Test
    public void StaffTestGet(){
        Staff staff = new Staff("Paweł","Wołów", "Nr 2", 200.0);
        Assert.assertEquals("Paweł", "Nr 2", staff.getSchool());
        Assert.assertEquals("Paweł", "Wołów", staff.getAdress());
        Assert.assertEquals("Paweł", "Paweł", staff.getName());

    }
}
