package SklepInternetowy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IProduct> products = new ArrayList<>();
        products.add(new ChineseDemocracy());
        products.add(new ZdrajcaMetalu());
        products.add(new HarryPotter());
        products.add(new LordOfTheRings());
        products.add(new GunsnRoses());

        int sum = 0;
        for(IProduct product : products){
            sum = sum + product.getPrice();
        }
        System.out.printf("Twoje zakupy będą kosztować: %d zł", sum);
    }
}
