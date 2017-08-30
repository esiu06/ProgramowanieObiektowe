package KawiarniaDekorator;

public class Mleko extends SkladnikiDekorator {

    private Napoj _napoj;

    public Mleko(Napoj napoj){
        _napoj = napoj;
    }
    @Override
    public String pobierzOpis() {
        return _napoj.pobierzOpis() + " mleko";
    }

    @Override
    public double koszt() {
        return _napoj.koszt() + 0.2;
    }
}
