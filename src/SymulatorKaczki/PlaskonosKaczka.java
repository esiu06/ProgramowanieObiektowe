package SymulatorKaczki;

public class PlaskonosKaczka extends Kaczka {
    public PlaskonosKaczka(){
        latanie = new LatamBoMamSkrzydłw();
        kwakanie = new Kwacz();
    }
    @Override
    public void wyswietl() {
        System.out.println("Wyświetlam płaskonosa");
    }
}
