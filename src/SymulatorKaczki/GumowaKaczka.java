package SymulatorKaczki;

public class GumowaKaczka extends Kaczka{

    public GumowaKaczka(){
        latanie = new NieLatam();
        kwakanie = new Piszczenie();
    }
//    @Override
//    public void kwacz() {
//        System.out.println("Pisk Pisk");
//    }
//
//    @Override
//    public void lec() {
//        System.out.println("Nie umniem latać");
//    }

    @Override
    public void wyswietl() {
        System.out.println("Wyświetlam gumowa kaczkę");
    }
}
