package SklepInternetowy;

public class LordOfTheRings extends Book {
    public LordOfTheRings() {
        super(80, "Book2", "LordOfTheRings", "Tolkien");
    }


    @Override
    public int getProductName() {
        return getPrice();
    }
}
