package ZadaniaPowtorkowe.Zad5;

/**
 * Created by Esiu on 2017-09-10.
 */
public class Mirror {
    public static void main(String[] args) {

        int[][] tab = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.printf("%d ", tab[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        int [][]out = new int[tab.length][tab[0].length];
        int [][]out2 = new int[tab.length][tab[0].length];

        for (int i = 0; i < tab.length; i++) {
            for (int j = tab[i].length-1; j >=0; j--) {
                out[i][tab[i].length - j - 1]= tab[i][j];
            }
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.printf("%d ", out[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i = tab.length - 1; i >= 0; i--) {
            for (int j = 0; j <= tab.length - 1; j++) {
                out[tab[i].length - i - 1][j]= tab[i][j];
            }
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.printf("%d ", out[i][j]);
            }
            System.out.println();
        }
    }
}
