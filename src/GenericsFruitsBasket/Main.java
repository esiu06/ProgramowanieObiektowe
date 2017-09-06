package GenericsFruitsBasket;

public class Main {
    public static void main(String[] args) {
        Apple jablko = new Apple();
        FruitsBasket<Apple> fb= new FruitsBasket<>();

        fb.setFruit(jablko);
        System.out.println(fb.getFruitName() + "\n" + fb.getFruitColor());
    }
}
