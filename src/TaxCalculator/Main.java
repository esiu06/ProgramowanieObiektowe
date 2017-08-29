package TaxCalculator;

import java.util.ArrayList;

/**
 * Created by Esiu on 2017-08-29.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<IProduct> products = new ArrayList<>();
        products.add(new ZaginionyWAkcji());
        products.add(new RamboPierwszKrew());
        products.add(new Robocop());

        ITax plTax = new PolishTax();
        ITax usTax = new UsaTax();
        ITax czTax = new CzechTax();
        ITax deTax = new GermanTax();

        Calculator calculator = new Calculator(products, plTax);

        calculator.showBasketWithProductsNettoAndBrutto();
        calculator.setTax(deTax);
        calculator.showBasketWithProductsNettoAndBrutto();
        calculator.setTax(usTax);
        calculator.showBasketWithProductsNettoAndBrutto();
        calculator.setTax(czTax);
        calculator.showBasketWithProductsNettoAndBrutto();
    }

}
