package Generics;

public class Main {
    public static void main(String[] args) {
//        Shoes shoes = new Shoes();
        TShirt tshirt = new TShirt();
        Suitcase<TShirt> suitcase = new Suitcase<>();

        suitcase.setThing(tshirt);
        System.out.println(suitcase.getThingName());
        System.out.println(suitcase.getThingSize());

    }
}
