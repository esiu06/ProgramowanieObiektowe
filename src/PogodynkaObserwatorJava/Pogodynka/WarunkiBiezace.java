package PogodynkaObserwatorJava.Pogodynka;

import java.util.Observable;
import java.util.Observer;

public class WarunkiBiezace implements IWyswietl , Observer{
    private float _temperatura;
    private float _wilgotnosc;
    private float _cisnienie;
    private Observable _danePogodowe;

    WarunkiBiezace(DanePogodowe danePogodowe){
        _danePogodowe = danePogodowe;
        danePogodowe.addObserver(this);
    }

    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane: %f stC, %f %%, %f hPA\n", _temperatura, _cisnienie, _wilgotnosc);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof DanePogodowe)
        _temperatura = ((DanePogodowe) o).getTemperatura();
        _wilgotnosc = ((DanePogodowe) o).getWilgotnosc();
        _cisnienie = ((DanePogodowe) o).getCisnienie();
        wyswietl();
    }
}
