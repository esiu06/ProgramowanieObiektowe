package ZarzadzanieKaretkami;

/**
 * Created by Esiu on 2017-08-30.
 */
public class ThirdAmbulance implements IAmbulance{
    private IOperator opetator;

    public ThirdAmbulance(IOperator opetator){
        this.opetator = opetator;
        opetator.registerObserver(this);
    }
    @Override
    public void update() {
        driveToIncident();
    }

    private void driveToIncident() {
        System.out.println(ThirdAmbulance.class.getSimpleName() + " received a notification and is driving to incident right now!");
        System.out.println("Incident " + opetator.getStatus());
    }
}
