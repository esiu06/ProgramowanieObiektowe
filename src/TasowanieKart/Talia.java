package TasowanieKart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Esiu on 2017-08-27.
 */
public class Talia {
    private ArrayList<Karta> _talia;
    public Talia(){
        _talia = new ArrayList<>();
        for (KolorEnum k:KolorEnum.values()) {
            for (KartaEnum r:KartaEnum.values()) {
                _talia.add(new Karta(r,k));
            }
        }
    }
    public void printTalia(){
        for(Karta karta:_talia){
            System.out.println(karta.toString());
        }
    }
    public void tasujTalie(){
        Collections.shuffle(_talia);
    }
}
