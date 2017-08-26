package DzienTygodnia;

import java.time.DayOfWeek;

public class DzienTygodnia {

    public enum dzienTygodnia {PONIEDZIAŁEK, WTOREK, ŚRODA;

        public String getDay() {
            return null;
        }
    }

        private final String Day;

        DzienTygodnia(String Day){
            this.Day = Day;
        }

        String getDay(){
            return Day;
        }

    public static void main(String[] args) {

        for (dzienTygodnia Day : dzienTygodnia.values()) {

            System.out.printf("%s %s\n", Day, Day.getDay());
        }
    }
}
