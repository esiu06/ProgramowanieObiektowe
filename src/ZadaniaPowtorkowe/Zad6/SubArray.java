package ZadaniaPowtorkowe.Zad6;

/**
 * Created by Esiu on 2017-09-10.
 */
public class SubArray {
    public static void main(String[] args) {

        int[][] tab = new int[][]{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}};
        int[][] out = subTab(tab, 2,2,2,2);

        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out[1].length; j++) {
                System.out.printf("%d ", out[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] subTab(int[][] tab, int x, int y, int sizeX, int sizeY) {
        int[][] out = new int[sizeX][sizeY];
        for (int i = x; i < x + sizeX; i++) {
            for (int j = y; j <y + sizeY ; j++) {
                out[i - x][j - y] = tab[i][j];
            }
        }
        return out;
    }
}
