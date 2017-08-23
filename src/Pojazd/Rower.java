package Pojazd;

public class Rower implements IDwuKolowy {
    @Override
    public void przewrocSie() {
        System.out.printf("Wywracam się!\n");
    }

    @Override
    public void jadz() {
        System.out.printf("Jadę Rowerem!\n");
    }

    @Override
    public void hamuj() {
        System.out.printf("Hamuję Rowerem!\n");
    }
}
