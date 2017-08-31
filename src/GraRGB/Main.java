package GraRGB;

/**
 * Created by Esiu on 2017-08-31.
 */
public class Main {
    public static void main(String[] args) {

        TarczaDrewniana td = new TarczaDrewniana();
        Power10 p10 = new Power10(td);
        Power20 p20 = new Power20(p10);
        System.out.printf("Tarcza : %s Obrona : %d",p20.pobierzOpis(), p20.mocObrona() );
    }
}
