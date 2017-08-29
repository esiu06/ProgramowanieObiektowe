package TaxCalculator;

/**
 * Created by Esiu on 2017-08-29.
 */
public class CzechTax implements ITax {
    @Override
    public double calkulateBruttoPrice(double price) {
        return price + price * 0.10;
    }

    @Override
    public String getCountryCode() {
        return "CZ-cz";
    }
}
