package ZadaniaPowtorkowe.Zad4;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Esiu on 2017-09-10.
 */
public class JapanesCalendar implements IMCalendar {
    @Override
    public void CalculateDate() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, new Locale("ja", "JP", "JP"));
        System.out.println(df.format(new Date()));
    }
}
