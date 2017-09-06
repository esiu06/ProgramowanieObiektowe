package Kalkulator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

     int liczba1;
     int liczba2;
     char znak;

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        liczba1 = sc.nextInt();
        System.out.println("Podaj drugą liczbę");
        liczba2 = sc.nextInt();

        znak = sc.nextLine().charAt(0);

        switch (znak){
            case '+':
                System.out.println(liczba1 + liczba2);
                break;
        }

    }
}
