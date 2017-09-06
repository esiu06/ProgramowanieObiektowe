package Generics;

public class Suitcase <T extends Clothes & ICanBeFolded> {
    private T _thing;

    public T getThing() {
        return _thing;
    }

    public void setThing(T thing) {
        _thing = thing;
    }
    public String getThingName(){
        return _thing.getName();
    }
    public String getThingDescription(){
        return _thing.getDescriptionTag();
    }
    public String getThingSize(){
        return _thing.getSize();
    }
}
