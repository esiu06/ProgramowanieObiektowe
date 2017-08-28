package Sorter;

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter(new SortowanieBabelkowe());
        int[] tabToSort = {1,4,2,1,1};
        int[] sorted = sorter.doSorting(tabToSort);

        for(int element : sorted){
            System.out.println(element);
        }
    }
}
