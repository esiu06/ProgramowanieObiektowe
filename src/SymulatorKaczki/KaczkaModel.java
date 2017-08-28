package SymulatorKaczki;

public class KaczkaModel extends Kaczka {
    public KaczkaModel(){
        latanie = new LatamBoMamSkrzydłw();
        kwakanie = new NieKwacz();
    }

    @Override
    public void wyswietl() {
        System.out.println("Wyświetlam kaczkę model");
    }
}
