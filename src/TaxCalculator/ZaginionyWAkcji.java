package TaxCalculator;

/**
 * Created by Esiu on 2017-08-29.
 */
public class ZaginionyWAkcji implements IProduct {
    private String _name;
    public double _nettoPrice;

    public ZaginionyWAkcji(){
        _name = "Zaginiony w akcji";
        _nettoPrice = 19.99;
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public double getNettoPrice() {
        return _nettoPrice;
    }
}
