package GraNozycePapierKamien;

import java.util.Random;
import java.util.Scanner;

public class NozycePapierKamien {

    public enum RuchGry {NOZYCE, PAPIER, KAMIEN, WYJSCIE}

    public enum StanGry {WYGRANA, REMIS, PRZEGRANA}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RuchGry ruchKomputer = RuchGry.KAMIEN;
        RuchGry ruchGracza = RuchGry.KAMIEN;
        int remisy = 0;
        int zwyciestwa = 0;
        int przegrane = 0;
        int iloscGier = 0;

        String gracz = "";


        while (!ruchGracza.equals(RuchGry.WYJSCIE)) {
            System.out.println("Podaj swój ruch:\nn - nożyce\np - papier\nk - kamień\nq = wyjście\n");
            String akcja = sc.nextLine();

            switch (akcja.toLowerCase()) {
                case "n":
                    ruchGracza = RuchGry.NOZYCE;
                    break;
                case "k":
                    ruchGracza = RuchGry.KAMIEN;
                    break;
                case "p":
                    ruchGracza = RuchGry.PAPIER;
                    break;
                case "q":
                    ruchGracza = RuchGry.WYJSCIE;
                    break;
                default:
                    continue;

            }
            Random rand = new Random();

            switch (rand.nextInt(3)) {
                case 0:
                    ruchKomputer = RuchGry.NOZYCE;
                    System.out.println("Komputer wybrał nożyce\n");
                    break;
                case 1:
                    ruchKomputer = RuchGry.KAMIEN;
                    System.out.println("Komputer wybrał kamień\n");
                    break;
                case 2:
                    ruchKomputer = RuchGry.PAPIER;
                    System.out.println("Komputer wybrał papier\n");
                    break;
            }
            StanGry wynik = ktoWygral(ruchGracza, ruchKomputer);

            if(wynik.equals(StanGry.REMIS))
                remisy++;
            else if(wynik.equals(StanGry.WYGRANA))
                zwyciestwa++;
            else
                przegrane++;

            iloscGier++;
        }

        System.out.printf("Zagrałeś %d gier. Wygrałeś: %d razy (%f). Przegrałeś: %d (%f)",
                iloscGier, zwyciestwa, (double)zwyciestwa/iloscGier*100, przegrane, (double)przegrane/iloscGier*100);

    }



    public static StanGry ktoWygral(RuchGry ruchGracza, RuchGry ruchKomputer) {
        if (ruchGracza.equals(RuchGry.KAMIEN) && ruchKomputer.equals(RuchGry.KAMIEN)) {
            return StanGry.REMIS;
        }
        if (ruchGracza.equals(RuchGry.KAMIEN) && ruchKomputer.equals(RuchGry.PAPIER)) {
            return StanGry.PRZEGRANA;
        }
        if (ruchGracza.equals(RuchGry.KAMIEN) && ruchKomputer.equals(RuchGry.NOZYCE)) {
            return StanGry.WYGRANA;
        }
        if (ruchGracza.equals(RuchGry.PAPIER) && ruchKomputer.equals(RuchGry.PAPIER)) {
            return StanGry.REMIS;
        }
        if (ruchGracza.equals(RuchGry.PAPIER) && ruchKomputer.equals(RuchGry.KAMIEN)) {
            return StanGry.WYGRANA;
        }
        if (ruchGracza.equals(RuchGry.PAPIER) && ruchKomputer.equals(RuchGry.NOZYCE)) {
            return StanGry.PRZEGRANA;
        }
        if (ruchGracza.equals(RuchGry.NOZYCE) && ruchKomputer.equals(RuchGry.NOZYCE)) {
            return StanGry.REMIS;
        }
        if (ruchGracza.equals(RuchGry.NOZYCE) && ruchKomputer.equals(RuchGry.PAPIER)) {
            return StanGry.WYGRANA;
        }
        if (ruchGracza.equals(RuchGry.NOZYCE) && ruchKomputer.equals(RuchGry.KAMIEN)) {
            return StanGry.PRZEGRANA;
        }
        return StanGry.REMIS;
    }
}
