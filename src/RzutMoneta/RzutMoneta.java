package RzutMoneta;


import java.util.Random;
import java.util.Scanner;

/**
 * Created by Esiu on 2017-08-27.
 */
public class RzutMoneta {
    public enum MonetaEnum {AVERS, REVERS, WYJSCIE}
    public enum StatusGry {WYGRANA, PRZEGRANA}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MonetaEnum WyborGracza = MonetaEnum.REVERS;
        MonetaEnum RzutKomputer = MonetaEnum.REVERS;
        int iloscGier = 0;
        int wygrana = 0;
        int przegrana = 0;

        while (!RzutKomputer.equals(MonetaEnum.WYJSCIE)) {
            System.out.println("Zgadnij rzut");
            String decyzja = sc.nextLine();

            switch (decyzja.toLowerCase()) {
                case "a":
                    WyborGracza = MonetaEnum.AVERS;
                    break;
                case "r":
                    WyborGracza = MonetaEnum.REVERS;
                    break;
                case "q":
                    WyborGracza = MonetaEnum.WYJSCIE;
                    break;
                default:
                    continue;

            }

            Random rand = new Random();

            switch (rand.nextInt(2)) {
                case 0:
                    RzutKomputer = RzutMoneta.MonetaEnum.AVERS;
                    System.out.println("Komputer wyrzucił: AVERS");
                    break;
                case 1:
                    RzutKomputer = RzutMoneta.MonetaEnum.REVERS;
                    System.out.println("Komputer wyrzucił: REVERS ");
                    break;
            }


            StatusGry wynik = ktoWygral(WyborGracza, RzutKomputer);

            if (wynik.equals(StatusGry.WYGRANA)) {
                wygrana++;
                iloscGier++;
            } else {
                przegrana++;
                iloscGier++;
            }
        }

            System.out.printf("Zagrałeś %d gier. Wygrałaś %d razy(%f). Przegrałeś %D razy(%f).", iloscGier, wygrana, (double) wygrana / iloscGier * 100, przegrana, (double) przegrana / iloscGier * 100);
        }


    private static StatusGry ktoWygral(MonetaEnum WyborGracza, MonetaEnum RzutKomputer) {
        if(WyborGracza.equals(MonetaEnum.AVERS) && RzutKomputer.equals(MonetaEnum.AVERS))
            return StatusGry.WYGRANA;
        if(WyborGracza.equals(MonetaEnum.REVERS) && RzutKomputer.equals(MonetaEnum.REVERS))
            return StatusGry.WYGRANA;

        return StatusGry.PRZEGRANA;
    }
}

