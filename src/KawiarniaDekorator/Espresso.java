package KawiarniaDekorator;

public class Espresso extends Napoj {
//    @Override
//    public void ustawOpis(String opis) {
//        super.opis = "Espresso";
//    }
    public Espresso (){
        opis="ESpresso";
    }
    @Override
    public double koszt() {
        return 5.99;
    }
}
