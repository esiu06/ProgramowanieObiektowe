package SymulatorKaczki;


public class Main {
    public static void main(String[] args) {
//        PlaskonosKaczka pk = new PlaskonosKaczka();
//        pk.wykonajLatanie();
//
//        DzikaKaczka dk = new DzikaKaczka();
//        dk.wykonajLatanie();
//
//        GumowaKaczka gk = new GumowaKaczka();
//        gk.wyswietl();
//        gk.wykonajKwakanie();
//        gk.wykonajLatanie();
//
//        KaczkaWabik kw = new KaczkaWabik();
//        kw.wykonajKwakanie();
//        kw.wykonajLatanie();
//        kw.wyswietl();
        KaczkaModel km = new KaczkaModel();
        km.wyswietl();
        km.wykonajLatanie();
        km.setLatanie(new LatanieZNanedemRakietowym());
        km.wykonajLatanie();
    }
}
