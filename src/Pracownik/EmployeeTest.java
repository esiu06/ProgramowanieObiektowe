package Pracownik;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Esiu on 2017-08-28.
 */
public class EmployeeTest {
    @Test
    public void employeeDefaultGetIdGetFirstNameGetLastNameGetSalaryTest(){
        Employee pracownik = new Employee(12,"Paweł","Esiu", 30000);
        Assert.assertEquals(12, pracownik.getId());
        Assert.assertEquals("Paweł", pracownik.getFirstName());
        Assert.assertEquals("Esiu", pracownik.getLastName());
        Assert.assertEquals(30000, pracownik.getSalary());
    }
    @Test
    public void employeeDefaultGetNameTest(){
        Employee pracownik = new Employee(12,"Paweł","Esiu", 30000);
        Assert.assertEquals("Paweł Esiu", pracownik.getName());
    }
    @Test
    public void employeeDefaultAnnualSalaryTest(){
        Employee pracownik = new Employee(12,"Paweł","Esiu", 30000);
        Assert.assertEquals(360000, pracownik.getAnnualSalary());
    }
    @Test
    public void employeeDefaultSetSalaryTest() {
        Employee pracownik = new Employee(12, "Paweł", "Esiu", 30000);
        pracownik.setSalary(32000);
        Assert.assertEquals(32000, pracownik.getSalary());
    }
    @Test
    public void employeeDefaultReiseSalaryTest() {
        Employee pracownik = new Employee(12, "Paweł", "Esiu", 30000);
        Assert.assertEquals(33000, pracownik.raiseSalary(10));
    }
}
