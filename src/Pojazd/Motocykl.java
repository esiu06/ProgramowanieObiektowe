package Pojazd;

public class Motocykl implements IDwuKolowy {
    @Override
    public void przewrocSie() {
        System.out.printf("Wywracam się!\n");
    }

    @Override
    public void jadz() {
        System.out.printf("Jadę motorem!\n");
    }

    @Override
    public void hamuj() {
        System.out.printf("Hamuję motorem!\n");
    }
    public void dodajGazu(){
        System.out.printf("Dodaję gazu!\n");
    }
}
