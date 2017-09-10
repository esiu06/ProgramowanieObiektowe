package ZadaniaPowtorkowe.Zad1;

/**
 * Created by Esiu on 2017-09-10.
 */
public class ZliczanieLitery {
    public static void main(String[] args) {
        char[] letters = args[0].toLowerCase().toCharArray();
        char letter = letters[0];
        int counter = 0;
        for (int i = 1; i < args.length; i++) {
            String word = args[i].toLowerCase();
            for (Character ch: word.toCharArray()) {
                if(ch.equals(letter)){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
