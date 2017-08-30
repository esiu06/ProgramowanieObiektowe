package ZarzadzanieKaretkami;

/**
 * Created by Esiu on 2017-08-30.
 */
public class Main {
    public static void main(String[] args) {
        OperatorAdam operatorAdam = new OperatorAdam();
        FirstAmbulance firstAmbulance = new FirstAmbulance(operatorAdam);
        SecondAnbulance secondAnbulance = new SecondAnbulance(operatorAdam);
        ThirdAmbulance thirdAmbulance = new ThirdAmbulance(operatorAdam);

        operatorAdam.setStatus("Car accident");
        operatorAdam.setStatus("Faint");
        operatorAdam.setStatus("Broken bone");

    }
}
