package DzienTygodnia;

import java.time.DayOfWeek;

public class DzienTygodnia {

    public enum dzienTygodnia {
        PONIEDZIALEK("Mon"){
            public nextDay() {
                return WTOREK; }
        }, WTOREK("Tue"){
            public  nextDay() {
                return SRODA;}
        }, SRODA("Wed"){
            public nextDay() {
                return CZWARTEK; }
        }, CZWARTEK("Thu"){
            public nextDay() {
                return PIATEK;
            }
        }, PIATEK("Fri"){
            public nextDay() {
                return SOBOTA; }
        }, SOBOTA("Sat"){

            public nextDay() {
                return NIEDZIELA;
            }
        }, NIEDZIELA("Sun"){
            public nextDay() {
                return PONIEDZIALEK;
            }
        };

        private final String ang;

        dzienTygodnia(String ang){
            this.ang = ang;
        }

        public abstract dzienTygodnia nextDay();
        private final String Day;
        dzienTygodnia(String Day){
            this.Day = Day
        }

        String getDay(){
            return ang;
        }

    }
    public static void main(String[] args) {

        for (dzienTygodnia Day :dzienTygodnia.values()) {

            System.out.printf("%s %s\n", Day, Day.getDay());
        }

    }
}
