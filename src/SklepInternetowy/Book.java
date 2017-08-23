package SklepInternetowy;

public abstract class Book implements IProduct {
    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void setProductname(String name) {

    }

    @Override
    public String getProductName() {
        return null;
    }

    @Override
    public void setPrice(int price) {

    }
    public void setTitle (String title){

    }
    public String getTitle() {
        return null;
    }
    public String getAuthor(){
        return null;
    }
    public void setAuthor (){

    }
}
