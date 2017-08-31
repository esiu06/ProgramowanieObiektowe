package GraRGB;

/**
 * Created by Esiu on 2017-08-31.
 */
public class Power10 extends TarczaDekorator {
    Tarcza _tarcza;

    public Power10(Tarcza tarcza){
        _tarcza = tarcza;
    }

    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + " + Power10";
    }

    @Override
    public int mocObrona() {
        return _tarcza.mocObrona() + 10;
    }
}
