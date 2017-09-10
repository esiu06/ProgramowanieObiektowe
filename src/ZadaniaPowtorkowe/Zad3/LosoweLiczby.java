package ZadaniaPowtorkowe.Zad3;

import java.util.Random;

/**
 * Created by Esiu on 2017-09-10.
 */
public class LosoweLiczby {
    public static void main(String[] args) {
        int amountOfRandomNumbers = Integer.parseInt(args[0]);

        Random random = new Random();

        int currentNumber = 0;
        int max = -100;
        int min = 100;
        int positive = 0;

        for (int i = 0; i < amountOfRandomNumbers; i++) {
            currentNumber = random.nextInt(100-(-100))+(-100);
            if(currentNumber > 0){
                positive++;
            }
            if(currentNumber > max){
                max = currentNumber;
            }
            if(currentNumber < min){
                min = currentNumber;
            }
        }
        System.out.println("Max: "+ max + " Min: "+ min + " Średnia: " + ((double)positive)/amountOfRandomNumbers );
    }
}
