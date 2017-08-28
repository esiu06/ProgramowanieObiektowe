package Pracownik;

/**
 * Created by Esiu on 2017-08-28.
 */
public class Main {
    public static void main(String[] args) {
        Employee pracownik = new Employee(12, "Paweł", "Esiu",30000);
        System.out.println(pracownik);

        System.out.println("Annual Salary: "+pracownik.getAnnualSalary());
    }
}
