package TaxCalculator;

/**
 * Created by Esiu on 2017-08-29.
 */
public class GermanTax implements ITax {
    @Override
    public double calkulateBruttoPrice(double price) {
        return price + price * 0.15;
    }

    @Override
    public String getCountryCode() {
        return "DE-de";
    }
}
