package Zadanie3Dziedziczenie;

/**
 * Created by Esiu on 2017-08-27.
 */
public class Staff extends Person {

    private String _school;
    private double _pay;

    public Staff(String name, String adress, String school, double pay) {
        super(name, adress);
        _school = school;
        _pay = pay;
    }

    public String getSchool() {
        return _school;
    }

    public void setSchool(String school) {
        _school = school;
    }

    public double getPay() {
        return _pay;
    }

    public void setPay(double pay) {
        _pay = pay;
    }
    public String toString() {
        return String.format("Staff{Person[name=%s,aderss=%s],school=%s,pay=%d");
    }
}
