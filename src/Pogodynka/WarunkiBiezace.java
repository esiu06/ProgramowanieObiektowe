package Pogodynka;

public class WarunkiBiezace implements IWyswietl,IObserwator {
    private float _temperatura;
    private float _wilgotnosc;
    private float _cisnienie;
    private IPodmiot _danePogodowe;

    WarunkiBiezace(IPodmiot danePogodowe){
        _danePogodowe = danePogodowe;
        _danePogodowe.zarejestrujObserwatora(this);
    }

    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane: %f stC, %f hPA, %f %%", _temperatura, _cisnienie, _wilgotnosc);
    }

    @Override
    public void aktualizuj(float temperatura, float cisnienie, float wilgotnosc) {
        _temperatura = temperatura;
        _wilgotnosc = wilgotnosc;
        _cisnienie = cisnienie;
        wyswietl();
    }
}
