package KawiarniaDekorator;

public class Czekolada extends SkladnikiDekorator {

    private  Napoj _napoj;

    public Czekolada(Napoj napoj){
        _napoj = napoj;
    }
    @Override
    public String pobierzOpis() {
        return _napoj.pobierzOpis() + " Czekolada";
    }

    @Override
    public double koszt() {
        return _napoj.koszt() + 0.2;
    }
}
