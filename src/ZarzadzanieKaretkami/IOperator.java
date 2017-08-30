package ZarzadzanieKaretkami;

public interface IOperator {
    void registerObserver(IAmbulance anbulace);
    void deleteObserver(IAmbulance ambulance);
    void notifyObserver();
    String getStatus();
}
