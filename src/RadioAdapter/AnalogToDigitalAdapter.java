package RadioAdapter;

public class AnalogToDigitalAdapter implements IDigitalSignal {
    private IAnalogSignal _radioFM;
    public AnalogToDigitalAdapter (IAnalogSignal radioFM){
        _radioFM = radioFM;
    }
    @Override
    public int[] getDigital() {
        return recalculateAnalogToDigital();
    }

    private int[] recalculateAnalogToDigital() {
        double[] signal = _radioFM.getAnalog();
        int[]digitalSignal = new int[Math.floorDiv(signal.length,8)];
        int sum = 0;

        for (int i = 0, it =0;  i <signal.length ; i=i+8) {
            for (int j = 0; j <8 ; j++) {
                if(signal[i+j]>1.0){
                    sum += (Math.pow(2,j));
                }
            }
            digitalSignal[it]=sum;
            it++;
            sum = 0;
        }
        return digitalSignal;
    }

    @Override
    public void setDigital(int[] digitalData) {

    }

    @Override
    public void printDigital() {
        int[] digitalSignal = recalculateAnalogToDigital();
        for (int digitalSignalPart:digitalSignal) {
            System.out.printf("%d", digitalSignalPart);
            
        }

    }
}
