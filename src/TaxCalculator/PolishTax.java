package TaxCalculator;

/**
 * Created by Esiu on 2017-08-29.
 */
public class PolishTax implements ITax {
    @Override
    public double calkulateBruttoPrice(double price) {
        return price + price * 0.23;
    }

    @Override
    public String getCountryCode() {
        return "PL-pl";
    }
}
