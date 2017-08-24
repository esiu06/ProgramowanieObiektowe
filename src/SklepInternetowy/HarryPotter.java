package SklepInternetowy;

public class HarryPotter extends Book {

    public HarryPotter() {
        super(30, "Book one", "HarryPotter", "J.K.Rowling");
    }

    @Override
    public int getProductName() {
        return getPrice();
    }
}
