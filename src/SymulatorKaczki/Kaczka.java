package SymulatorKaczki;

public abstract class Kaczka {
    protected Ilatanie latanie;
    protected Ikwakanie kwakanie;

//    public void kwacz(){
//        System.out.println("Kwa Kwa!");
//    }

    public void plywaj(){
        System.out.println("Pływu Pływu");
    }
    public void wyswietl(){
        System.out.println("Wyświetlam kaczkę");
    }

    public void wykonajLatanie(){
        latanie.lec();
    }
    public void wykonajKwakanie(){
        kwakanie.kwacz();
    }

    public void setKwakanie(Ikwakanie kwakanie) {
        this.kwakanie = kwakanie;
    }

    public void setLatanie(Ilatanie latanie) {
        this.latanie = latanie;
    }
    //    public void lec(){
//        System.out.println("Kaczka lata!");
//    }
    //reszta metod
}
