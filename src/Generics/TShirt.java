package Generics;

public class TShirt extends Clothes implements ICanBeFolded {
    @Override
    public String getDescriptionTag() {
        return "białt Tshirt";
    }

    @Override
    public String getName() {
        return "tsirt";
    }

    @Override
    public String getSize() {
        return "L";
    }
}
