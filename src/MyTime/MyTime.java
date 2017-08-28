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
       setTime (godzina, minuta, sekunda);
    }

    private void setTime(int godzina, int minuta, int sekunda) {
        setGodzina(godzina);
        setMinuta(minuta);
        setSekunda(sekunda);
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

        if (godzina < 24 && godzina > 0) {
            _godzina = godzina;
        } else {
            _godzina = -10000;
        }
    }
    public void setMinuta(int minuta) {

        if(minuta<60 && minuta>0){
            _minuta = minuta;
        }else{
            _minuta = -10000;
        }
    }

    public void setSekunda(int sekunda) {

        if(sekunda<60 && sekunda>0){
            _sekunda = sekunda;
        }else{
            _sekunda = -10000;
        }
    }
    public String toString() {
        return String.format("%02d:%02d:%02d",_godzina,_minuta,_sekunda);
    }

    public MyTime nextSecunda(){

        if(_sekunda != 59) {
            _sekunda = _sekunda + 1;
        }else{
            nextMinuta();
            _sekunda = 0;
        }
        return this;
    }
    public MyTime nextMinuta() {

        if (_minuta != 59) {
            _minuta = _minuta + 1;
        } else {
            nextGodzina();
            _minuta = 0;
        }
        return this;
    }
    public MyTime nextGodzina(){

        if(_godzina !=59) {
            _godzina = (_godzina + 1) % 24;
        }
        return this;
    }

    public MyTime previoisSecunda(){

        if(_sekunda !=0){
            _sekunda = _sekunda-1;
        }else{
            _sekunda = 59;
            previoisMinuta();
        }
        return this;
    }
    public MyTime previoisMinuta(){

        if(_minuta!=0){
            _minuta = _minuta-1;
        }else{
            _minuta = 59;
            previoisGodzina();
        }
        return  this;

    }

    private MyTime previoisGodzina() {

        if(_godzina!=0){
            _godzina = _godzina-1;
        }else{
            _godzina = 23;
        }
        return this;
    }
}
