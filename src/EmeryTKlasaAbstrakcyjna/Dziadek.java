package EmeryTKlasaAbstrakcyjna;

public class Dziadek extends Emeryt {
    @Override
    public void krzyczNaDzieci() {
        System.out.printf("Za moich czasów ...");
    }

    @Override
    public void walczOMiejsceWAutobusie() {
        System.out.printf("Wali laską po nogach\n");
    }
    public void zapalPapierosa(){
        System.out.printf("Palę szluga\n");
    }

    @Override
    public void upieczSzarlotke() {
        System.out.printf("Szarlotka Dziadka\n");
    }
}
