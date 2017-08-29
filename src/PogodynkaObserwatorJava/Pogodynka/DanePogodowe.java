package PogodynkaObserwatorJava.Pogodynka;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class DanePogodowe extends Observable{

    private float _temperatura;
    private float _wilgotnosc;
    private float _cisnienie;


    public DanePogodowe(){}

    public void odczytyZmiennych(){
        setChanged();
    }

    public void ustawZmienne(float temperatura, float cisnienie, float wilgotnosc){
        _temperatura  = temperatura;
        _wilgotnosc= wilgotnosc;
        _cisnienie= cisnienie;
        odczytyZmiennych();
    }

    public float getTemperatura() {
        return _temperatura;
    }

    public float getCisnienie() {
        return _cisnienie;
    }

    public float getWilgotnosc() {
        return _wilgotnosc;
    }
}
