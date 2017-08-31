package Adapter;

public class DzikaKaczka implements IKaczka{
    @Override
    public void kwacz() {
        System.out.println("Kwa Kwa Kwa!!!");
    }

    @Override
    public void lataj() {
        System.out.println("Fru Fru Fru!!!");
    }
}
