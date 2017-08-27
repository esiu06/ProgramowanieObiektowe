package DzienTygodnia2;

import DzienTygodnia.DzienTygodniaEnum;

/**
 * Created by Esiu on 2017-08-27.
 */
public class DzieTygodnia2 {
    public static void main(String[] args) {

        for(DzienTygodniaEnum2 day: DzienTygodniaEnum2.values()) {
            System.out.printf("%s: %s next day is %s\n", day, day.getDay(),day.next());
        }
    }

}
