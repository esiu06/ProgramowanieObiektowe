package Kolekcje;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tablica {
    public static void main(String[] args) {
        int[] ints = new int[]{0,1,2,3,4,5,6,7,8,9};
        Integer[] intigers = new Integer[]{0,1,2,3,4,5,6,7,8,9};

        List intList = Arrays.asList(ints);
        List IntigerList = Arrays.asList(intigers);

        List<Integer> l1= new ArrayList();
        l1.addAll(IntigerList);

        List<Integer> Lista4 = new ArrayList<>();
        Lista4.addAll(l1);







    }
}
