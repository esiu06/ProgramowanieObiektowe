package TaxCalculator;

/**
 * Created by Esiu on 2017-08-29.
 */
public class Robocop implements IProduct {

    private String _name;
    public double _nettoPrice;

    public Robocop(){
        _name = "Robocop";
        _nettoPrice = 13.99;
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
