package Sorter;

public class SortowaniePrzezZliczanie implements ISort {
    @Override
    public int[] sort(int[] tab) {
        int max = getMax(tab);
        int[]tabZliczen = new int[max+1];
        for (int i = 0; i <tab.length; i++) {
            tabZliczen[tab[i]]++;
        }
        int[] tabZwrotow = new int[tab.length];
        int iterator = 0;
        for (int i = 0; i <tabZliczen.length ; i++) {
            while (tabZliczen[i]>0){
                tabZliczen[iterator]=i;
                tabZliczen[i]--;
                iterator++;
            }
        }
        return tabZwrotow;
    }

    private int getMax(int[] tab) {
        int max = 0;
        for (int i = 0; i < tab.length; i++) {
            if(max<tab[i]){
                max=tab[i];
            }
        }
        return max;
    }
}
