package TaxCalculator;

/**
 * Created by Esiu on 2017-08-29.
 */
public class RamboPierwszKrew implements IProduct {

    private String _name;
    public double _nettoPrice;

    public RamboPierwszKrew(){
        _name = "Rambo Pierwsz krew";
        _nettoPrice = 22.99;
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
