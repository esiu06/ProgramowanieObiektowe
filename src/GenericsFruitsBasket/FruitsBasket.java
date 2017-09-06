package GenericsFruitsBasket;

public class FruitsBasket<T extends IFruit> {
    T _fruit;
    public T getFriut(){
        return _fruit;
    }

    public void setFruit(T fruit) {
        _fruit = fruit;
    }
    public String getFruitColor(){
        return _fruit.getColor();
    }
    public String getFruitName(){
        return _fruit.getName();
    }
}

