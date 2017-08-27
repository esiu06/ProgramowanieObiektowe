package DzienTygodnia2;

/**
 * Created by Esiu on 2017-08-27.
 */
public enum DzienTygodniaEnum2 {
    PONIEDZIALEK("Mon"){
        public DzienTygodniaEnum2 next(){
            return WTOREK;
        }
    }, WTOREK("Tue"){
        public DzienTygodniaEnum2 next(){
            return SRODA;
        }
    }, SRODA("Wen"){
        public DzienTygodniaEnum2 next(){
            return CZWARTEK;
        }
    }, CZWARTEK("Thu"){
        public DzienTygodniaEnum2 next(){
            return PIATEK;
        }
    }, PIATEK("Fri"){
        public DzienTygodniaEnum2 next(){
            return SOBOTA;
        }
    }, SOBOTA("Sat"){
        public DzienTygodniaEnum2 next(){
            return NIEDZIELA;
        }
    }, NIEDZIELA("Sun"){
        public DzienTygodniaEnum2 next(){
            return PONIEDZIALEK;
        }
    };

    public abstract DzienTygodniaEnum2 next();
    private final String day;
    DzienTygodniaEnum2(String day){
        this.day = day;
    }
    String getDay(){
        return day;
    }
}
