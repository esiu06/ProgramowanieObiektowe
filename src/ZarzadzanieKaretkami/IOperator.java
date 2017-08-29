package ZarzadzanieKaretkami;

public interface IOperator {
    void registerObserver();
    void deleteObserver();
    void notifyObserver();
}
