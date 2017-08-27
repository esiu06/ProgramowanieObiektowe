package TasowanieKart;

/**
 * Created by Esiu on 2017-08-27.
 */
public class Karta {
    private KartaEnum _karta;
    private KolorEnum _kolor;
    public Karta (KartaEnum karta, KolorEnum kolor){
        _karta = karta;
        _kolor = kolor;
    }
    public KartaEnum getKarta() {
        return _karta;
    }
    public KolorEnum getKolor() {
        return _kolor;
    }
    public String toString() {
        return String.format("Karta: %s Kolor: %s", _karta,_kolor);
    }
}
