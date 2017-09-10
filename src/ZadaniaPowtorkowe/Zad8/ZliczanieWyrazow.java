package ZadaniaPowtorkowe.Zad8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Esiu on 2017-09-10.
 */
public class ZliczanieWyrazow {
    public static void main(String[] args) throws IOException {

        String fillName ="C:\\Users\\Esiu\\Documents\\ProgramowanieObiektowe\\src\\ZadaniaPowtorkowe\\Text.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fillName));
        int sentenceCount = 0;
        int words = 0;
        String line;
        String delimiters = "?!.";
        String space = " ";
        while ((line = reader.readLine()) != null){
            String[]aa = line.split(" ");
            for (int i = 0; i < aa.length; i++) {
                if(!(aa[i].contains(".") || aa[i].contains("!") || aa[i].contains("?"))){
                    words++;
                }
                else{
                    words++;
                    System.out.println("Wyrazy: " + words);
                    sentenceCount++;
                    words=0;
                }
            }
        }
        reader.close();
        System.out.println("Liczba zdań: " + sentenceCount);
    }
}

