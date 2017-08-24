package GraNozycePapierKamien;

import java.util.Scanner;

public class NozycePapierKamien {

    public enum Ruch {NOZYCE, PAPIER, KAMIEN, WYJSCIE}
    public enum StanGry {WYGRANA, REMIS, PRZEGRANA}

    public static void main(String[] args) {
        System.out.println("Wybierz akcje\nn - nożyce\np - papier\nk - kamień\nq - wyjście z gry");
        Scanner sc = new Scanner(System.in);

        String gracz = "";


        while (true) {
            String akcja = sc.nextLine();

            int komp = (int) (Math.random() * 3);
            Ruch ruchKomputer = Ruch.KAMIEN;
            Ruch ruchGracza = Ruch.KAMIEN;

            if (akcja.equals("n")) {
                ruchGracza = Ruch.NOZYCE;
                continue;
            }
            if (akcja.equals("p")) {
                ruchGracza = Ruch.PAPIER;
                continue;
            }
            if (akcja.equals("k")) {
                ruchGracza = Ruch.KAMIEN;

            }
            if (akcja.equals("q")) {
                break;
            } else {
                System.out.println("BŁĄD!!!!");
                System.out.println("Wybierz akcje\nn - nożyce\np - papier\nk - kamień\nq - wyjście z gry");
                continue;

            }

//            if(komp%3==0){
////                ruchKomputer = Ruch.KAMIEN;
//            }
//            if (komp%3==1){
//                ruchKomputer = Ruch.NOZYCE;
//            }
//            if(komp%3==2){
//                ruchKomputer = Ruch.PAPIER;
//            }


        }//Statystyka


    }
    public StanGry ktoWygral(Ruch ruchGracza, Ruch ruchKomputer){
        if(ruchGracza.equals(Ruch.KAMIEN) && ruchKomputer.equals(Ruch.KAMIEN)){
            return StanGry.REMIS;
        }
        if(ruchGracza.equals(Ruch.KAMIEN) && ruchKomputer.equals(Ruch.PAPIER)){
            return StanGry.PRZEGRANA;
        }
        if(ruchGracza.equals(Ruch.KAMIEN) && ruchKomputer.equals(Ruch.NOZYCE)){
            return StanGry.WYGRANA;
        }
        if(ruchGracza.equals(Ruch.PAPIER) && ruchKomputer.equals(Ruch.PAPIER)){
            return StanGry.REMIS;
        }
        if(ruchGracza.equals(Ruch.PAPIER) && ruchKomputer.equals(Ruch.KAMIEN)){
            return StanGry.WYGRANA;
        }
        if(ruchGracza.equals(Ruch.PAPIER) && ruchKomputer.equals(Ruch.NOZYCE)){
            return StanGry.PRZEGRANA;
        }
        if(ruchGracza.equals(Ruch.NOZYCE) && ruchKomputer.equals(Ruch.NOZYCE)){
            return StanGry.REMIS;
        }
        if(ruchGracza.equals(Ruch.NOZYCE) && ruchKomputer.equals(Ruch.PAPIER)){
            return StanGry.WYGRANA;
        }
        if(ruchGracza.equals(Ruch.NOZYCE) && ruchKomputer.equals(Ruch.KAMIEN)){
            return StanGry.PRZEGRANA;
        }
        return StanGry.REMIS;
    }
}