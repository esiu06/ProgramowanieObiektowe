package DzienTygodnia;

/**
 * Created by Esiu on 2017-08-27.
 */
public enum DzienTygodniaEnum {
    PONIEDZIALEK("Mon"), WTOREK("Tue"), SRODA("Wen"), CZWARTEK("Thu"), PIATEK("Fri"), SOBOTA("Sat"), NIEDZIELA("Sun");

    public String getAng (){
        return day;
    }
    String day;

    DzienTygodniaEnum(String ang) {
        day = ang;
    }
}
