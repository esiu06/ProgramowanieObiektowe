package ZadaniaPowtorkowe.Zad4;

/**
 * Created by Esiu on 2017-09-10.
 */
public class Main {
    public static void main(String[] args) {
        JapanesCalendar mbc = new JapanesCalendar();
        Thai thai = new Thai();
        CalendarStrategy cs = new CalendarStrategy(mbc);
        cs.printToday();
        cs.setCalendar(mbc);
        cs.printToday();


    }
}
