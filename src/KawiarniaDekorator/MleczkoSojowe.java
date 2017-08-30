package KawiarniaDekorator;

public class MleczkoSojowe extends SkladnikiDekorator {

    private Napoj _napoj;

    public MleczkoSojowe(Napoj napoj){
        _napoj = napoj;
    }
    @Override
    public String pobierzOpis() {
        return _napoj.pobierzOpis() + "Mleczko sojowe";
    }

    @Override
    public double koszt() {
        return _napoj.koszt() + 0.15;
    }
}
