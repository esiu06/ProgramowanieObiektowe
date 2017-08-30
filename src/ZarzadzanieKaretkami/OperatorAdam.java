package ZarzadzanieKaretkami;

import java.util.ArrayList;
import java.util.List;

public class OperatorAdam implements  IOperator{
    List<IAmbulance> anbulaces = new ArrayList<>();
    String status = "";
    @Override
    public void registerObserver(IAmbulance anbulace) {
        anbulaces.add(anbulace);
    }

    @Override
    public void deleteObserver(IAmbulance ambulance) {
        anbulaces.remove(ambulance);
    }

    @Override
    public void notifyObserver() {
        for (IAmbulance ambulace:anbulaces) {
            ambulace.update();
        }

    }

    @Override
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObserver();
    }
}
