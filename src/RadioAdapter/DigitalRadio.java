package RadioAdapter;

public class DigitalRadio  implements IDigitalSignal{
    private int[] _digitalSingnal;


    @Override
    public int[] getDigital() {
        return _digitalSingnal;
    }

    @Override
    public void setDigital(int[] digitalData) {
        _digitalSingnal = digitalData;
    }

    @Override
    public void printDigital() {
        for (int digitalSingnalPart:_digitalSingnal) {
            System.out.printf("%d",digitalSingnalPart);
        }
    }
}
