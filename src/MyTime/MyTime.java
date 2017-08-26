package MyTime;

/**
 * Created by Esiu on 2017-08-26.
 */
public class MyTime {
    private int _godzina = 0;
    private int _minuta = 0;
    private int _sekunda = 0;

    public MyTime(){}
    public MyTime(int godzina, int minuta, int sekunda){
        _godzina = godzina;
        _minuta = minuta;
        _sekunda = sekunda;
    }

    public int getGodzina() {
        return _godzina;
    }

    public int getMinuta() {
        return _minuta;
    }

    public int getSekunda() {
        return _sekunda;
    }

    public void setGodzina(int godzina) {
        _godzina = godzina;
    }

    public void setMinuta(int minuta) {
        _minuta = minuta;
    }

    public void setSekunda(int sekunda) {
        _sekunda = sekunda;
    }
    public String toString() {
        return ("HH:MM:SS");
    }
    public MyTime nextSecunda(int sekunda){
        return nextSecunda(getSekunda());
    }
    public MyTime nextMinuta(int minuta){
        return nextMinuta(getMinuta());
    }
    public MyTime nextGodzina(int godzina){
        return nextGodzina(getGodzina());
    }
    public MyTime previoisSecunda(int sekunda){
        return previoisSecunda(getSekunda());
    }
}
