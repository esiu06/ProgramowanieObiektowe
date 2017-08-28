package SymulatorKaczki;

public class DzikaKaczka extends Kaczka {
    public DzikaKaczka(){
        latanie = new LatamBoMamSkrzydłw();
        kwakanie = new Kwacz();
    }
    @Override
    public void wyswietl() {
        System.out.println("Wyświetlam Dziką Kaczkę");
    }
}
