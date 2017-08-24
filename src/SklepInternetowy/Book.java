package SklepInternetowy;

public abstract class Book implements IProduct {
    protected int price;
    protected String name;
    protected String title;
    protected String author;

    public Book(int price, String name, String title, String author) {
        this.price = price;
        this.name = name;
        this.title = title;
        this.author = author;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setProductName(String name) {
        this.name = name;
    }
}