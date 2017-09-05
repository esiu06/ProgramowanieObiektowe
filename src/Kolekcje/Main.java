package Kolekcje;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> zbior  = new TreeSet<String>();

        zbior.add("Kowalski");
        zbior.add("Miller");
        zbior.add("Małysz");
        zbior.add("Nowak");
        zbior.add("Milik");

        for (String s:zbior) {
            System.out.println(s);
        }
        HashSet<Integer> zbior1 = new HashSet<>();
        zbior1.add(1);
        zbior1.add(2);
        zbior1.add(3);
        HashSet<Integer> zbior2 = new HashSet<>();
        zbior2.add(3);
        zbior2.add(4);

        zbior1.retainAll(zbior2);
        for (Integer s : zbior2) {
            System.out.println(s);
        }
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(6);
        ts.add(7);
        Integer zzz = ts.hashCode();
    }
}
