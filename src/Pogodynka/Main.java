package Pogodynka;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DanePogodowe dp = new DanePogodowe();
        WarunkiBiezace wb = new WarunkiBiezace(dp);

        dp.ustawZmienne(11, 1030, 45);
        System.out.println();
        Thread.sleep(10000);

        dp.ustawZmienne(13, 1033,50);

    }
}
