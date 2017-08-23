package Pojazd;

public class Samochod implements ICzteroKolowy {

    @Override
    public void jedzNaCzolowke() {
        System.out.printf("Jadę na czołówkę!\n");
    }

    @Override
    public void jadz() {
        System.out.printf("Jadę!\n");

    }

    @Override
    public void hamuj() {
        System.out.printf("Hamuję!\n");

    }
}
