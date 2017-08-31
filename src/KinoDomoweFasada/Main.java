package KinoDomoweFasada;

public class Main {
    public static void main(String[] args) {
        Telewizor tv = new Telewizor();
        ThermoMix tm = new ThermoMix();
        Wzmacniacz wzm = new Wzmacniacz();

        FasadaKinaDomowego fkd = new FasadaKinaDomowego(tv,tm,wzm);
        fkd.wrocDoDomu();
        System.out.println("-----------------");
        fkd.wychodzeZDomu();
    }
}
