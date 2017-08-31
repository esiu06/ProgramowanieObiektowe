package Adapter;

import SymulatorKaczki.Kaczka;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DzikaKaczka kaczka = new DzikaKaczka();
        DzikiIndyk indyk = new DzikiIndyk();
        IndykAdapter ia = new IndykAdapter(indyk);
        KaczkaAdapter ka = new KaczkaAdapter(kaczka);
        ArrayList<IIndyk> ptaki = new ArrayList<>();
        ptaki.add(indyk);
        ptaki.add(ka);
        uruchomKwakanieILatanie(ptaki);
    }
    public static void uruchomKwakanieILatanie(ArrayList<IIndyk> ptaki){
        for (IIndyk indyk:ptaki) {
            indyk.gulgocze();
            indyk.lataj();

        }
    }
}
