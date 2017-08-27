package RzutMoneta;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Esiu on 2017-08-27.
 */
public class RzutMoneta {
    private static String Avers = "A";
    private static String Revers = "R";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Wybor;
        RzutMonetaEnum RzutKomputer =RzutMonetaEnum.REVERS;

        RzutMonetaEnum stanGry;
        System.out.println("Zgadnij co wypadło A = Awers, R - Rewers, Q - wyjście");
        Wybor = sc.nextLine();
        if(Wybor =="Q"){

        }

        Random rand = new Random();

        switch (rand.nextInt(2)){
            case 0:
                RzutKomputer = RzutMonetaEnum.AVERS;
                System.out.println("Komputer wyrzucił: AVERS");
                break;
            case 1:
                RzutKomputer = RzutMonetaEnum.REVERS;
                System.out.println("Komputer wyrzucił: REVERS ");
                break;
        }
    }



}

