package RadioAdapter;

/**
 * Created by Esiu on 2017-09-01.
 */
public class Main {
    public static void main(String[] args) {
        DigitalRadio dr = new DigitalRadio();
        RadioFM rfm = new RadioFM(8);
        AnalogToDigitalAdapter adapter = new AnalogToDigitalAdapter(rfm);
        int[]zzz = adapter.getDigital();
        System.out.println(adapter);
    }
}
