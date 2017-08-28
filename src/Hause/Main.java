package Hause;

/**
 * Created by Esiu on 2017-08-28.
 */
public class Main {
    public static void main(String[] args) {
        Hause hause = new Hause("22", "Leśna", "Wołów","56-100");
        System.out.println(hause);
        hause.setCityAndPostalCode("Wrocław", "52-120");
        System.out.println(hause);
    }
}
