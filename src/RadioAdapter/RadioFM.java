package RadioAdapter;

import java.util.Random;

public class RadioFM implements IAnalogSignal {
    private double[] _analogSignal;


    RadioFM() {
    }

    RadioFM(int signalLength) {
        Random rand = new Random();
        _analogSignal = rand.doubles(8 * signalLength, 0.0, 2.0).toArray();
    }


    @Override
    public double[] getAnalog() {
        return _analogSignal;
    }

    @Override
    public void setAnalog(double[] analogData) {
        _analogSignal = _analogSignal;
    }

    @Override
    public void printDigital() {
        for (double signalPart : _analogSignal) {
            System.out.printf("%f", signalPart);
        }
    }
}


