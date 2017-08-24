package SklepInternetowy;

/**
 * Created by Esiu on 2017-08-24.
 */
public class ZdrajcaMetalu extends Book {
    public ZdrajcaMetalu() {
        super(50, "Płyta", "ZdrajcaMetalu", "Autor");
    }

    @Override
    public int getProductName() {
        return 0;
    }
}

