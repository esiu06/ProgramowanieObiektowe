package KawiarniaDekorator;

public class Main {
    public static void main(String[] args) {
        MocnoPalona mp = new MocnoPalona();
        Czekolada czek = new Czekolada(mp);
        Mleko mleko = new Mleko(czek);
        System.out.printf("Nazwa: %s :: Cena: %2f", mleko.pobierzOpis(), mleko.koszt());
    }
}
