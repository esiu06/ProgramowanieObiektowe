package SymulatorKaczki;

public class KaczkaWabik extends Kaczka{
    public KaczkaWabik(){
        latanie = new NieLatam();
        kwakanie = new NieKwacz();
    }
//    @Override
//    public void kwacz() {
//        System.out.println("Nie umiem kwakać");
//    }
//
//    @Override
//    public void lec() {
//        System.out.println("Nie umniem latać");
//    }

    @Override
    public void wyswietl() {
        System.out.println("Wyśiwtlam drewnianą kaczkę");
    }
}
