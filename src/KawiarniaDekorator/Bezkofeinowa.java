package KawiarniaDekorator;

public class Bezkofeinowa extends Napoj {

    public Bezkofeinowa(){
     opis = "Bezkofeinowa";
    }

    @Override
    public double koszt() {
        return 1.99;
    }
}
