package KawiarniaDekorator;

public class BitaSmietana extends SkladnikiDekorator {
    private Napoj _napoj;

    public BitaSmietana(Napoj napoj){
        _napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return _napoj.pobierzOpis() + " Bita śmietana";
    }

    @Override
    public double koszt() {
        return _napoj.koszt() + 0.1;
    }
}
