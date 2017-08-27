package DzienTygodnia;

public class DzienTygodnia {
    public static void main(String[] args) {

        for(DzienTygodniaEnum day: DzienTygodniaEnum.values()) {
            System.out.printf("%s: %s\n", day, day.getAng());
        }
    }

}