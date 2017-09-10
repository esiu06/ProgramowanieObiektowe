package ZadaniaPowtorkowe.Zad4;

import java.time.LocalDate;

/**
 * Created by Esiu on 2017-09-10.
 */
public class CalendarStrategy {
    IMCalendar calendar;

    public CalendarStrategy(IMCalendar calendar){
        this.calendar = calendar;
    }
    public void printToday(){
        LocalDate localDate = LocalDate.now();
        calendar.CalculateDate();
    }
    public void setCalendar(IMCalendar calendar){
        this.calendar = calendar;
    }

}
