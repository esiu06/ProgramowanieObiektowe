package ZadaniaPowtorkowe.Zad7;

/**
 * Created by Esiu on 2017-09-10.
 */
public class Rekurencja {
    public static void main(String[] args) {
        fun1("ABCDEF");

    }
    static void fun1(String str){
        if(str.length()>1){
            fun1(str.substring(1));
        }
        System.out.print(str.charAt(0));
    }
}
