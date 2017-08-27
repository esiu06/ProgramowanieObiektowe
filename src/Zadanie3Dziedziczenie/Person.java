package Zadanie3Dziedziczenie;

/**
 * Created by Esiu on 2017-08-27.
 */
public class Person {
    private String _name;
    private String _adress;

    public Person(String name, String adress){
        _name = name;
        _adress = adress;
    }
    public String getName(){
        return _name;
    }

    public String getAdress() {
        return _adress;
    }
    public String toString() {
        return String.format("Person[name=%s,adress=%s");
    }
}
