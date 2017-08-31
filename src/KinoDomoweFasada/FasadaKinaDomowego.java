package KinoDomoweFasada;

public class FasadaKinaDomowego {
    private Telewizor _telewizor;
    private ThermoMix _thermoMix;
    private Wzmacniacz _wzmacniacz;

    public FasadaKinaDomowego(Telewizor tv, ThermoMix tm, Wzmacniacz wzm){
        _telewizor = tv;
        _thermoMix = tm;
        _wzmacniacz = wzm;
    }
    public void wrocDoDomu(){
        _thermoMix.wlacz();
        _thermoMix.zrobObiad();
        _wzmacniacz.wlacz();
        _telewizor.ustawKanal();
        _telewizor.ustawGlosnosc();
    }
    public void wychodzeZDomu(){
        _thermoMix.wylacz();
        _telewizor.wylacz();
        _wzmacniacz.wylacz();
    }
}
