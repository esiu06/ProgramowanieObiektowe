package ExceptionCalculator;

public class Calculator {
    public static void main(String[] args) {
        int sum = 0;
        int temp = 0;
        for(String s : args){
            try {
                temp = Integer.parseInt(s);
            }
            catch (IllegalArgumentException e){
                System.out.println("Znaki " + s + " nie są liczbami");

                temp = 0;
            }
            sum += temp;
        }
        System.out.println("Wynik: " + sum);

    }
}
