package MyTime;

public class Main {
    public static void main(String[] args) {
        MyTime czas = new MyTime(23,58,59);
        System.out.println(czas);
        czas.nextSecunda();
        System.out.println(czas);
        czas.previoisSecunda();
        System.out.println(czas);
    }
}
