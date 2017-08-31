package GraRGB;

/**
 * Created by Esiu on 2017-08-31.
 */
public class Power20 extends TarczaDekorator {
    Tarcza _tarcza;

    public Power20(Tarcza tarcza){
        _tarcza = tarcza;
    }
    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + " + Power20";
    }

    @Override
    public int mocObrona() {
        return _tarcza.mocObrona() + 20;
    }
}
