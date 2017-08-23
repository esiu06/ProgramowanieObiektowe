package Pojazd;

public class Main {
    public static void main(String[] args) {
        IPojazd samochod = new Samochod();
        samochod.hamuj();
        ICzteroKolowy samochod1 = new Samochod();
        samochod1.jedzNaCzolowke();
        IPojazd motocykl1 = new Motocykl();
        motocykl1.hamuj();
        Motocykl motocykl = new Motocykl();
        motocykl.dodajGazu();

    }
}
