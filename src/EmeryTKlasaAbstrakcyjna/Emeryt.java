package EmeryTKlasaAbstrakcyjna;

public abstract class Emeryt implements ISzarlotka{

    public static final int ILOSC_OCZU = 2;//stała
        public abstract void krzyczNaDzieci(); //metoda abstrakcyjna – wdrażamy w kl dziedz

    public abstract void walczOMiejsceWAutobusie();

    public void biegnijDoSklepu(int odleglosc, int predkosc) {
        double czas = (double) odleglosc / predkosc;
        System.out.println("Biegne po kiełbase bede za " + czas);
    }
    public static void glupiaMetoda(){}
}
